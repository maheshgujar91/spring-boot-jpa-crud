package com.cjc.spring_pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cjc.spring_pro.model.Student;

@Repository
public interface HomeRepositry2 extends JpaRepository<Student, Integer>{

}
