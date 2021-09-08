package com.exercise.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.crud.JPAUtil;
import com.exercise.crud.interfaceService.IAcademicService;
//import com.exercise.crud.interfaces.IAcademic;
import com.exercise.crud.model.Academic;

@Service
public class FacadeService implements IAcademicService {
	
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	//private IAcademic data;

	@Override
	public List<Academic> getAll() {
		// TODO Auto-generated method stub
		
		List<Academic> todos = new ArrayList<>();
		Query query = entity.createQuery("SELECT * FROM academic_info");
		todos=query.getResultList();
		return todos;
	}

	@Override
	public List<Academic> getById(int id_academic) {
		Query query = entity.createQuery("SELECT * FROM academic_info WHERE id_academic = " + id_academic);
		List<Academic> todos = new ArrayList<>();
		todos = query.getResultList();
		return todos;
	}

	@Override
	public int save(Academic a) {
		//int res = 0;
		//Academic academic = data.save(a);
		
		//if (!academic.equals(null)) {
			//res = 1;  
		//}
		//System.out.print(res);
		return (Integer) 0;
	}

	@Override
	public void delete(int id_academic) {
		// TODO Auto-generated method stub
		Query query = entity.createQuery("DELETE FROM academic_info WHERE id_academic = " + id_academic);
		query.executeUpdate();
		
	}
	
	

}
