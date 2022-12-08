package com.example.GDTC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GDTC.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByUserId(int id);

}
