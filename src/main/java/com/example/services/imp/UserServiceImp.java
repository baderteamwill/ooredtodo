package com.example.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.userRepository;

@Service
public class UserServiceImp implements UserService {
@Autowired
private userRepository userRepository ;

@Override
public User save(User user) {
	// TODO Auto-generated method stub
	return userRepository.save(user);
}

@Override
public List<User> findAll() {
	// TODO Auto-generated method stub
	return userRepository.findAll();
} 
	
	
	
	
}
