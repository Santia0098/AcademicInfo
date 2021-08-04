package com.exercise.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.crud.interfaceService.IAcademicService;
import com.exercise.crud.interfaces.IAcademic;
import com.exercise.crud.model.Academic;


@Service
public class AcademicService implements IAcademicService {

	@Autowired
	private IAcademic data;
	@Override
	public List<Academic> getAll() {
		// TODO Auto-generated method stub
		return (List<Academic>)data.findAll();
	}

	@Override
	public Optional<Academic> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Academic a) {
		// TODO Auto-generated method stub
		int res = 0;
		Academic academic = data.save(a);
		
		if (!academic.equals(null)) {
			res = 1;  
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
