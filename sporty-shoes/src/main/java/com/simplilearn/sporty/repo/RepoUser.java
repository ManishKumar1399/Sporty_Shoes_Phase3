package com.simplilearn.sporty.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.sporty.Entity.User;

@Repository
public interface RepoUser extends JpaRepository<User, Integer> {
	@Query(value = "select u from User u where u.userName=:name")
	Optional<User> findUserByName(String name);
}
