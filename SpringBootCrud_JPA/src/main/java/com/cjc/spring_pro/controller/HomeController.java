package com.cjc.spring_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.spring_pro.model.Student;
import com.cjc.spring_pro.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preLogin() {
		
		return "Login";
	}
	@RequestMapping("/reg")
	public String preRegister() {
		return "Register";
	}
	@RequestMapping("/register")
	public String registerCheck(@ModelAttribute Student s) {
		
		     hs.saveData(s);
		
			return "Login";	
	}
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("username") String un, @RequestParam("password") String pw, Model model) {
		
		if(un.equals("admin") && pw.equals("admin")) {
			List<Student> al=hs.displayAll();
			model.addAttribute("sdata", al);
			return "Success";
		}else {
		List<Student> udl= hs.loginUser(un, pw);
		if(!udl.isEmpty()) {
		model.addAttribute("sdata",udl);
		return "Success";
		}else {
			model.addAttribute("message", "Please Enter Valid Username and Password");
			return "Login";
		}
	  }
	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id, Model model) {
		List<Student> dl=hs.deleteData(id);
		model.addAttribute("sdata", dl);
		
		return "Success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("id") int id, Model model) {
		
		Student s = hs.editData(id);
		model.addAttribute("sdata", s);
		return "Update";
	}
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s, Model model) {
		List<Student> al= hs.updateData(s);
		model.addAttribute("sdata", al);
		return "Success";
	}
 	}
