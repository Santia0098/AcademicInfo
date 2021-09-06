//package com.exercise.crud.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.exercise.crud.interfaces.IAcademic;
//import com.exercise.crud.model.Academic;
//
//public class FacadeService {
//	
//	@Autowired
//	private IAcademic data;
//	
//	public int saveData(Academic a) {
//		
//		int res = 0;
//		Academic academic = data.save(a);
//		
//		if (!academic.equals(null)) {
//			res = 1;  
//		}
//		return res;
//		
//		
//	}
//
//}
