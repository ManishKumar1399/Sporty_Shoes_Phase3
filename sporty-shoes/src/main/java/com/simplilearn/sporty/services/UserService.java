package com.simplilearn.sporty.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sporty.Entity.User;
import com.simplilearn.sporty.repo.RepoUser;


@Service
public class UserService {

	@Autowired
	RepoUser userRepository;

	public User signUp(User user) {
		return userRepository.save(user);
	}
	
	public User saveUserWithProduct(User user) {
		return userRepository.save(user);
	}

	public List<User> allSignedUpUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getSignedUpUserByName(String name) {
		Optional<User> user = userRepository.findUserByName(name);
		return user;
	}
	
	public Optional<User> getSignedUpUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
}
