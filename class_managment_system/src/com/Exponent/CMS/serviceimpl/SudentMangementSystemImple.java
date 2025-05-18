package com.Exponent.CMS.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Exponent.CMS.Entity.Batch;
import com.Exponent.CMS.Entity.Course;
import com.Exponent.CMS.Entity.Faculty;
import com.Exponent.CMS.Entity.Studaent;
import com.Exponent.CMS.service.SudentMangementSystem;

public class SudentMangementSystemImple implements SudentMangementSystem {

	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Studaent> slist = new ArrayList<Studaent>();

	@Override
	public void addCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many courses you have to add");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {

			Course course = new Course();

			System.out.println("enter the Course id");
			course.setCid(sc.nextInt());

			System.out.println("enter the course name");
			course.setCname(sc.next());

			clist.add(course);

		}

	}

	@Override
	public void displayCourse() {

		for (Course course : clist) {
			System.out.println(course);
		}

	}

	@Override
	public void addFaculty() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Faculty you have to add");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {

			Faculty faculty = new Faculty();

			System.out.println("enter the faculty id");
			faculty.setFid(sc.nextInt());

			System.out.println("enter the faculty name");
			faculty.setFname(sc.next());

			displayCourse();
			int cid = validcid();

			for (Course course : clist) {

				if (course != null & course.getCid() == cid) {

					faculty.setCourse(course);
				}

			}

			flist.add(faculty);
		}

	}

	@Override
	public int validcid() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course id");
		int cid = sc.nextInt();

		boolean flag = false;
		for (Course course : clist) {

			if (course != null & course.getCid() == cid) {
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("enter the valies course id");

			return validcid();
		}

		return cid;

	}

	public void displayFaculty() {

		for (Faculty faculty : flist) {
			System.out.println(faculty);

		}
	}

	@Override
	public void addBatch() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many batch you have to add");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {

			Batch batch = new Batch();

			System.out.println("enter the batch id");
			batch.setBid(sc.nextInt());

			System.out.println("enter the batch name");
			batch.setBname(sc.next());

			displayFaculty();
			int fid = validfid();

			for (Faculty faculty : flist) {

				if (faculty != null & faculty.getFid() == fid) {

					batch.setFaculty(faculty);
				}

			}

			blist.add(batch);
		}

	}

	public int validfid() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the faculty id");
		int fid = sc.nextInt();
		boolean flag = false;
		for (Faculty faculty : flist) {

			if (faculty != null & faculty.getFid() == fid)
				;

			flag = true;

		}

		if (!flag) {
			System.out.println("enter the valied fid");

			return validfid();
		}

		return fid;
	}

	@Override
	public void displayBatch() {
		for (Batch batch : blist) {
			System.out.println(blist);
		}

	}

	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many student you have to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			Studaent s = new Studaent();

			System.out.println("enter the sid");
			s.setSid(sc.nextInt());

			System.out.println("enter the sname");
			s.setSname(sc.next());

			displayBatch();

			int bid = validBid();

			for (Batch batch : blist) {

				if (batch != null & batch.getBid() == bid) {

					s.setBatch(batch);
				}
			}

			slist.add(s);
		}

	}

	public int validBid() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the batch id");

		int bid = sc.nextInt();

		boolean flag = false;

		for (Batch batch : blist) {

			if (batch != null & batch.getBid() == bid) {

				flag = true;
			}

		}

		if (!flag) {

			System.out.println("enter the valied batch id");

			return validBid();
		}

		return bid;
	}

	@Override
	public void displayStudent() {

		for (Studaent sc : slist) {
			System.out.println(sc);
		}

	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void delite() {
		// TODO Auto-generated method stub
		
	}

}
