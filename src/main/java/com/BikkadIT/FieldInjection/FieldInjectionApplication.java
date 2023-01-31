package com.BikkadIT.FieldInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.FieldInjection.controller.StudentController;

@SpringBootApplication
public class FieldInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(FieldInjectionApplication.class, args);
		
		StudentController studentController = run.getBean(StudentController.class);
		
		studentController.controllerMethod();
	}

}
