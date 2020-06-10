package com.example.services.imp;

import java.util.List;

import com.example.domain.User;

public interface UserService {

	User save (User user);
	
	List<User> findAll();



}
