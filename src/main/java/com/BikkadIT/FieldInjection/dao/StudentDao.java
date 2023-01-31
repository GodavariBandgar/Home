package com.BikkadIT.FieldInjection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	public void daoMethod() {
		System.out.println("Dao Method");
	}

}
