package com.controler;

import com.model.Dept;
import com.model.Studant;
import com.service.Collage;

public class Univarcity {
	public static void main(String[] args) {
		Collage c = new Collage();
		Studant p = c.getdata();
		System.out.println(p.rollno + " " + p.name + " " + p.address);
		Dept a = c.run();
		System.out.println(a.s1.rollno + " " + " " + a.s1.name + " " + a.s1.address);
		System.out.println(a.s2.rollno + " " + " " + a.s2.name + " " + a.s2.address);
		System.out.println(a.s3.rollno + " " + a.s3.name + " " + a.s3.address);

	}

}
