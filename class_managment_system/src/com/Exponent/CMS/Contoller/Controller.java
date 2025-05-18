package com.Exponent.CMS.Contoller;

import com.Exponent.CMS.service.SudentMangementSystem;
import com.Exponent.CMS.serviceimpl.SudentMangementSystemImple;

public class Controller {

	
	public static void main(String[] args) {
		
		
		SudentMangementSystem s=new SudentMangementSystemImple();
		
		s.addCourse();
		s.displayCourse();
		s.addFaculty();
		s.displayFaculty();
		s.addBatch();
		s.displayBatch();
		s.addStudent();
		s.displayStudent();
		
	}
}
