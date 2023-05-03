package com.cjc.spring_pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.spring_pro.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	List<Student> findAllByUsernameAndPassword(String un, String pw);

	public Student findAllById(int id);


}
