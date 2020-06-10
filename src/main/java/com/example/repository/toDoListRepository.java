package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.ToDoAlerte;

public interface toDoListRepository extends JpaRepository<ToDoAlerte,Integer> {

	  ToDoAlerte findById(int id);
	    
	  
	  
	
}
