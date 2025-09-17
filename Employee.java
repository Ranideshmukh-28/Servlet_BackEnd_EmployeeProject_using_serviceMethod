package com.servlet;

import java.io.IOException;
import java.security.Provider.Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submit")
public class Employee extends HttpServlet{
	
@Override
protected void service(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
	String id1 = reqest.getParameter("id");
	int id = Integer.parseInt(id1);
	
	String name = reqest.getParameter("name");
	
	String age1 = reqest.getParameter("age");
	int age = Integer.parseInt(age1);
	
	String dob = reqest.getParameter("dob");
	
	String city = reqest.getParameter("city");
	
	String department = reqest.getParameter("department");
	
	String salary1 = reqest.getParameter("salary");
	int salary = Integer.parseInt(salary1);
	
	String experience = reqest.getParameter("experience");
	int exp = Integer.parseInt(experience);
	
	String gender = reqest.getParameter("gender");
	
	String address = reqest.getParameter("address");
	
	String email = reqest.getParameter("email");
	
	String country = reqest.getParameter("country");
	
	String state = reqest.getParameter("state");
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(age);
	System.out.println(dob);
	System.out.println(city);
	System.out.println(department);
	System.out.println(salary);
	System.out.println(exp);
	System.out.println(gender);
	System.out.println(address);
	System.out.println(email);
	System.out.println(country);
	System.out.println(state);
	
}

}
