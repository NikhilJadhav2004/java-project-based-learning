package com.service;

import com.model.Dept;
import com.model.Studant;

public class Collage {

	public Studant getdata() {
		Studant s = new Studant();
		s.rollno = 10;
		s.name = "nikhil";
		s.address = "pune";
		return s;
	}

	public Dept run() {
		Dept d = new Dept();
		d.s1.rollno = 90;
		d.s1.name = "ram";
		d.s1.address = "mumbai";
		d.s2.rollno = 79;
		d.s2.name = "abhi";
		d.s2.address = "satara";
		d.s3.rollno=56;
		d.s3.name="om";
		d.s3.address="khatav";
		
		return d;

	}

}
