package com.studant;

public class LogiClass {
public static void main(String[] args) {
	//for single studant
	Studant s=new Studant();
	s.setId(82);
	s.setName("Abhi");
	s.setMark(99.09);
	s.setAddress("Satara");
	System.out.println(s.getId()+" "+s.getName()+" "+s.getMark()+" "+s.getAddress());
     //for multiple studant
	Dept o=new Dept();	
     o.s1.setId(67);
     o.s1.setName("Nikhil");
     o.s1.setMark(45.89);
     o.s1.setAddress("pune");
 	System.out.println(o.s1.getId()+" "+o.s1.getName()+" "+o.s1.getMark()+" "+o.s1.getAddress());
     o.s2.setId(89);
     o.s2.setName("rama");
     o.s2.setMark(80.67);
     o.s2.setAddress("mumbai");
  	System.out.println(o.s2.getId()+" "+o.s2.getName()+" "+o.s2.getMark()+" "+o.s2.getAddress());

     
}
}
