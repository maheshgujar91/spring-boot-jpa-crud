package com.cjc.spring_pro.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.spring_pro.model.Student;
import com.cjc.spring_pro.repository.HomeRepository;
import com.cjc.spring_pro.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
    
	@Autowired
	HomeRepository hr;

	@Override
	public Student saveData(Student s) {
		
	      return hr.save(s);
	}

	@Override
	public List<Student> loginUser(String un, String pw) {
		
	   List<Student> udl =hr.findAllByUsernameAndPassword(un, pw);
	   
	   return udl;
	}

	@Override
	public List<Student> displayAll() {
		List<Student> al=(List<Student>) hr.findAll();
		return al;
	}

	@Override
	public List<Student> deleteData(int id) {
		hr.deleteById(id);
		List<Student> dl=(List<Student>) hr.findAll();
		return dl;
	}
	
	
	@Override
	public Student editData(int id) {
		Student s= hr.findAllById(id);
		return s;
	}

	@Override
	public List<Student> updateData(Student s) {
		hr.save(s);
		List<Student> al = (List<Student>) hr.findAll();
		return al;
	}

}
