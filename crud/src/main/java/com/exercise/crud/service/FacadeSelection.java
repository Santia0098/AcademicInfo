package com.exercise.crud.service;

import com.exercise.crud.model.Academic;
import com.exercise.crud.service.FacadeService;

public class FacadeSelection {
	
	FacadeService all = new FacadeService();
	//AcademicService allAcademic = new AcademicService();
	
	
	/*-------------------------Objetos de Hibernate --------------------------------------*/
	public void hibernateAllInf() {
		all.getAll();
		
	}
	public void hibernateDeleteInf(int id) {
		all.delete(id);
	}
	
	public void hibernateSaveInf(Academic a) {
		all.save(a);
		
	}
	
	public void hibernateGetById(int id) {
		all.getById(id);
	}
	
	/* -----------------------Objetos de Spring------------------------- */
	
	/*public void springAllInf() {
		allAcademic.getAll();
		
	}
	public void springDeleteInf(int id) {
		allAcademic.delete(id);
	}
	
	public void springSaveInf(Academic a) {
		allAcademic.save(a);
		
	}
	
	public void springGetById(int id) {
		allAcademic.getById(id);
	}
*/
}
