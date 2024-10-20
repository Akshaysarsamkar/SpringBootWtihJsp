package com.example.demo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entities.Employees;

public interface EmpRepositary extends CrudRepository<Employees, Integer> {
	

	public List<Employees> findByNameAndAddress(String name, String address);
    public List<Employees> findByIdBetween(int start,int end);
    public List<Employees> findByNameStartsWith(String d);
    public List<Employees> findByNameEquals(String name);
    
    @Query("SELECT e from Employees e")
    public List<Employees> getAllEmployees();
    
    @Query(value = "SELECT emp from Employees emp WHERE emp.address =:add")
    public List<Employees> getAllEmployeesByAddress(@Param("add") String address);
    
    @Query(value="select emp from Employees emp where emp.className =:cn and emp.address =:a")
    public List<Employees> getAllEmployessByClassNameAndAddress(@Param("cn") String c,@Param("a") String add);
}
