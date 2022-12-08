package com.example.GDTC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GDTC.Entity.UserPersonal;

public interface PersonalRepo extends JpaRepository<UserPersonal, Integer> {

}
