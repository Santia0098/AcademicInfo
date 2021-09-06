package com.exercise.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.exercise.crud.JPAUtil;
import com.exercise.crud.interfaceService.IAcademicService;
import com.exercise.crud.interfaces.IAcademic;
import com.exercise.crud.model.Academic;

public class FacadeService implements IAcademicService {
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public List<Academic> getAll() {
		// TODO Auto-generated method stub
		
		List<Academic> todos = new ArrayList<>();
		Query query = entity.createQuery("SELECT * FROM academic_info");
		todos=query.getResultList();
		return todos;
	}

	@Override
	public Optional<Academic> getById(int id_academic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Academic a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id_academic) {
		// TODO Auto-generated method stub
		
	}
	
	

}
