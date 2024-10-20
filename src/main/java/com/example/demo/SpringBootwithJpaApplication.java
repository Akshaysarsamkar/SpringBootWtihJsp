package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entities.Employees;
import com.example.demo.Entities.User1;
import com.example.demo.repositary.EmpRepositary;
import com.example.demo.repositary.UserRepositary;

@SpringBootApplication
public class SpringBootwithJpaApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringBootwithJpaApplication.class, args);
		EmpRepositary repositary = run.getBean(EmpRepositary.class);

//		// insert operation
//		Employees employees = new Employees();
//		employees.setAddress("Gevrai");	
//		employees.setClassName("Tybca");
//		employees.setName("Akshay");
//
//		Employees employees1 = new Employees();
//		employees1.setAddress("Jalna");
//		employees1.setClassName("Tybca");
//		employees1.setName("Santabai");
//
//		List<Employees> list = new ArrayList<>();
//		list.add(employees1);
//		list.add(employees);

	//	Iterable<Employees> saveAll = repositary.saveAll(list);
//		saveAll.forEach(e -> {
//			System.out.println(e);
//		});

//		Employees employees2 = repositary.save(employees);

		// update data
//		Optional<Employees> optional = repositary.findById(1);
//		Employees employees = optional.get();
//
//		System.out.println("Before save emp : " + employees);
//
//		employees.setAddress("ramnagar");
//		employees.setName("radhesham");
//
//		Employees saveEmployees = repositary.save(employees);
//		System.out.println("After save the emp : " + saveEmployees);

		// select data
//		Optional<Employees> optional = repositary.findById(3);
//		Employees employees = optional.get();
//		System.out.println("Name of employee "+ employees.getName());
//		System.out.println("Address of employess : " + employees.getAddress());
//		System.out.println("Class of Emp :" + employees.getClassName());

//		Iterable<Employees> allemp = repositary.findAll();
//        allemp.forEach(emp ->{
//        	System.out.println("===============================================================");
//        	System.out.println("Emp id " + emp.getId());
//        	System.out.println("Name of employee "+emp.getName());
//        	System.out.println("Address of employess : " + emp.getAddress());
//        	System.out.println("Class of Emp :" + emp.getClassName());
//        	System.out.println("===============================================================");
//        	System.out.println();
//        });

//		 delete data
//		repositary.deleteById(103);
//		
//		repositary.delete(employees);
//		System.out.println("Deleted succesfully");
//		
//		repositary.deleteAll();
//		

//		// jpa access Keyword
//		List<Employees> nameAndAdress = repositary.findByNameAndAddress("suresh", "Beed");
//		System.out.println("Example with And keyword");
//		System.out.println("=============================================");
//		nameAndAdress.forEach(e -> {
//			System.out.println(e);
//		});
//		System.out.println("=============================================");
//		System.out.println();
//
//		List<Employees> byIdBetween = repositary.findByIdBetween(250, 300);
//		System.out.println("=============================================");
//		byIdBetween.forEach(e1 -> {
//			System.out.println(e1);
//		});
//		System.out.println("=============================================");
//		
//		
		List<Employees> byIdBetween1 = repositary.findByNameStartsWith("s");
		System.out.println("=============================================");
		byIdBetween1.forEach(e1 -> {
			System.out.println(e1);
		});
		System.out.println("=============================================");

		// @param and @query annotation
		System.out.println("=============================================");
		List<Employees> emp = repositary.getAllEmployees();
		emp.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("=============================================");

		
		System.out.println("=============================================");
		List<Employees> emp1 = repositary.getAllEmployeesByAddress("Beed");
		emp1.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("=============================================");


		System.out.println("=============================================");
		List<Employees> emp2 = repositary.getAllEmployessByClassNameAndAddress("FYBCA","Nagar");
		emp2.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("=============================================");
	}

}
