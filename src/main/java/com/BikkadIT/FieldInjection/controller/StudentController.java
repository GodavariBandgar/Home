package com.BikkadIT.FieldInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.FieldInjection.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public void controllerMethod() {
		System.out.println("Controller method");
		
		studentService.serviceMethod();
	}

}
