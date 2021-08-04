package com.exercise.crud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
