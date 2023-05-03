package com.cjc.spring_pro.service;

import java.util.List;

import com.cjc.spring_pro.model.Student;

public interface HomeService {

	public Student saveData(Student s);

	public List<Student> loginUser(String un, String pw);

	public List<Student> displayAll();

	public List<Student> deleteData(int id);

	public List<Student> updateData(Student s);

	public Student editData(int id);
}
