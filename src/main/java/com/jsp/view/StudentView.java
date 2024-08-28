
package com.jsp.view;


import java.util.Scanner;

import com.jsp.controller.StudentController;
import com.jsp.model.Student;

public class StudentView {
	private static Scanner sc=new Scanner(System.in);
	private static Student getStudent() {
		Student S=new Student();
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your email:");
		String email=sc.nextLine();
		System.out.println("Enter your password:");
		String password=sc.nextLine();
		System.out.println("Enter your course:");
		String course=sc.nextLine();
		System.out.println("Enter your branch:");
		String branch=sc.nextLine();
		System.out.println("Enter your gender:");
		String gender=sc.nextLine();
		System.out.println("Enter your mobilenumber:");
		long mob=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your relationship status:");
		String relationshipstatus=sc.nextLine();
		System.out.println("Enter your DOB:");
		String dob=sc.nextLine();
		System.out.println("Enter your Address:");
		String add=sc.nextLine();
		S.setId(id);
		S.setName(name);
		S.setEmail(email);
		S.setPassword(password);
		S.setCourse(course);
		S.setBranch(branch);
		S.setMob(mob);
		S.setGender(gender);
		S.setRelationshipStatus(relationshipstatus);
		S.setDob(dob);
		S.setAddress(add);
		return S;
		
		
	}
	public static void main(String[] args) {
		StudentController controller =new StudentController();
		while(true) {
			System.out.println("Welcome To SMS");
			System.out.println("******************");
			System.out.println("Enter Your Choice:");
			System.out.println("1.Save student");
			System.out.println("2.Find Student by id");
			System.out.println("3.Update Student by id");
			System.out.println("4.Delete Student by id");
			System.out.println("5.Find all student");
			System.out.println("6.Exit");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				Student S=getStudent();
				controller.saveStudent(S);
				break;
			case 2: 
				System.out.println("Enter the id:");
				int id=sc.nextInt();
				controller.findStudent(id);
				break;
			case 3: 
				System.out.println("Enter the id:");
				int id1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the new Relationship status:");
				String newRS=sc.nextLine();
				controller.UpdateStudent(id1, newRS);
				break;
			case 4: 
				System.out.println("Enter the id:");
				int id2=sc.nextInt();
				controller.DeleteStudent(id2);
				break;
			case 5: 
				controller.getAllStudent();
				break;
			case 6: 
				System.out.println("Thank You.....");
				return;
			default:
				System.out.println("Invalid Choice");
			}
		}
	
	}

}
