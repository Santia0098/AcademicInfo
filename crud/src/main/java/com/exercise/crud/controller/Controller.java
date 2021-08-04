package com.exercise.crud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exercise.crud.interfaceService.IAcademicService;
import com.exercise.crud.model.Academic;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@Autowired
	private IAcademicService service;
	
	@GetMapping("/getAll")
	public String getAll(Model model) {
		List<Academic> academic = service.getAll();
		
		model.addAttribute("academic", academic);
		return "index";
	}
	
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("academic",new Academic());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Academic academic,  Model model) {
		service.save(academic);
		return "redirect:/getAll";
	}
}
