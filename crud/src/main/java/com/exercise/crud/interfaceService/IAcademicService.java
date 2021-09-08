package com.exercise.crud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.exercise.crud.model.Academic;

public interface IAcademicService {

	
	
	public List<Academic> getAll();
	public List<Academic> getById(int id_academic);
	public int save(Academic a);
	public void delete(int id_academic);
}
