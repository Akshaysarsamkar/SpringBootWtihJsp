package com.example.demo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entities.User1;

public interface UserRepositary extends CrudRepository<User1, Integer> {
	
	@Query(value ="select U from User1 U where U.email=:e")
	public List<User1> getAllEmail(@Param("e") String email); 
	
	
}
