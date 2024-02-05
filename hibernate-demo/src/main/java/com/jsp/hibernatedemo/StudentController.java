package com.jsp.hibernatedemo;

import java.util.Scanner;

public class StudentController {
public static void main(String[] args) {

	boolean b = true;
	StudentDao dao = new StudentDao();
	while(b) {
		System.out.println("1.save student ");
		System.out.println("2.view student by id");
		System.out.println( "3.delete student by id ");
		System.out.println("4.exit");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the option");
		int n = scn.nextInt();
		
		switch(n) {
		case 1:{
			System.out.println("enter id");
			int sid = scn.nextInt();
			
			System.out.println("enter name");
			String sname = scn.next();
			
			System.out.println("enter age");
			int sage = scn.nextInt();
			
			Student s = new Student();
			s.setId(sid);
			s.setName(sname);
			s.setAge(sage);
			
			dao.saveStudent(s);
		}break;
		case 2:{
				System.out.println("enter id");
				int sid= scn.nextInt();
				
				Student s = dao.findById(sid);
				if(s!=null) {
					System.out.println(s.getId());
					System.out.println(s.getName());
					System.out.println(s.getAge());
				}else {
					System.out.println("invalid id try again");
				}
		}
		break;
		case 3: {
			System.out.println("enter id to delete");
			
			int sid = scn.nextInt();
			dao.deleteById(sid);
			System.out.println("data deleted");
		}
		break;
		case 4: {
			b=false;
		}
		default: {
			System.out.println("invalid option ");
		}
		}
	}
}
}
