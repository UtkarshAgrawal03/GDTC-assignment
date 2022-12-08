package com.example.GDTC.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GDTC.Entity.User;
import com.example.GDTC.repo.PersonalRepo;
import com.example.GDTC.repo.UserRepo;

import Responses.Reply;

@Service
public class UserService {
	@Autowired
	UserRepo ur;
	@Autowired
	PersonalRepo pr;
	
	//Service to create user
	public Reply createUser(User ud) {
		if(ur.save(ud)!=null) {
			return new Reply(true,"Record Inserted Successfully");
		}
		 return new Reply(false,"Record Insertion UnSuccessfull");
	}
	//service to get particular user by id
	public User getUser(int id) {
		
		return ur.findByUserId(id);
	}
	//Service to get all users
	public List<User> getUsers(){
		return ur.findAll();
	}
	//Service to delete user by id
	public Reply deleteUser(int id) {
		User user=ur.findByUserId(id);
		if(user!=null)
		{
			ur.delete(user);
			return new Reply(true,"Record deleted successfully");
		}
		return new Reply(false,"No Such Record exists");
		
	}
	//Service to update user
	public Reply updateUser(User user) {
		if(ur.save(user)!=null) {
			return new Reply(true,"Record Updated Successfully");
		}
		 return new Reply(false,"Record Updation UnSuccessfull");
	}

	
}
