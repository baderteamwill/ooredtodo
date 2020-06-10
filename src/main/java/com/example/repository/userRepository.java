package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.domain.User;
@RepositoryRestController
@CrossOrigin("*")
public interface userRepository extends JpaRepository<User,Integer>  {

	User findByUsernameAndPassword(String username,String password);
}
