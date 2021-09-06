package com.exercise.crud.interfaceService;

import java.util.List;
import java.util.Optional;
import com.exercise.crud.model.Courses;

public interface ICourseService {

	
	public List<Courses> getAll();
	public Optional<Courses> getByLanguage(String language);
	public int save(Courses a);
	public void delete(int id_course);
}
