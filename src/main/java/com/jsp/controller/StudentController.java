package com.jsp.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.model.Student;

public class StudentController {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("SMS");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveStudent(Student s) {
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Student Data Saved");
	}
	public void findStudent(int id) {
		Student S= em.find(Student.class, 101);
		if(S!=null) {
			System.out.println(S.getId()+" "+S.getName()+" "+S.getEmail()+" "+S.getPassword()+" "+S.getCourse()+" "+S.getGender()+" "+S.getBranch()+" "+S.getAddress()+" "+S.getRelationshipStatus());
		}
		else {
			System.out.println("Record not found");
		}
	}
	public void UpdateStudent(int id, String rstatus) {
		Student S= em.find(Student.class, 101);
		if(S!=null) {
			S.setRelationshipStatus(rstatus);
			et.begin();
			em.merge(S);
			et.commit();
			System.out.println("Record updated..");
		}
		else {
			System.out.println("Record not found");
		}
	}
	public void DeleteStudent(int id) {
		Student S= em.find(Student.class, 101);
		if(S!=null) {
			et.begin();
			em.remove(S);
			et.commit();
			System.out.println("Record Deleted..");
		}
		else {
			System.out.println("Record not found");
		}
	}
	public void getAllStudent() {
		Query q=em.createQuery("Select S from Student S");
		List<Student> list=q.getResultList();
		for(Student S: list) {
			System.out.println(S.getId()+" "+S.getName()+" "+S.getEmail()+" "+S.getPassword()+" "+S.getCourse()+" "+S.getGender()+" "+S.getBranch()+" "+S.getAddress()+" "+S.getRelationshipStatus());

		}
	}

}
