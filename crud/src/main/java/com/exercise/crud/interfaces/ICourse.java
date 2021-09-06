package com.exercise.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exercise.crud.model.Courses;


@Repository
public interface ICourse extends CrudRepository<Courses, Integer> {

}
