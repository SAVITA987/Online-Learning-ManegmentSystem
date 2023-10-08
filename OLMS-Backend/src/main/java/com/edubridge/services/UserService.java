package com.edubridge.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.model.Professor;
import com.edubridge.model.User;
import com.edubridge.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User updateUserProfile(User user)
	{
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers()
	{
		return (List<User>)userRepo.findAll();
	}
	
	public User fetchUserByEmail(String email)
	{
		return userRepo.findByEmail(email);
	}
	
	public List <User> fetchUserByUsername(String username)
	{
		return userRepo.findByUsername(username);
	}
	
	public User fetchUserByEmailAndPassword(String email, String password)
	{
		return userRepo.findByEmailAndPassword(email, password);
	}
	
	public List<User> fetchProfileByEmail(String email)
	{
		return (List<User>)userRepo.findProfileByEmail(email);
	}
	public List<User> deleteUserById(String userid)
	{
		User user = userRepo.findByUserid(userid);
		userRepo.delete(user);
		return (List<User>) userRepo.findAll();
	}
	public User getUserById(String userid) 
	{
		return userRepo.findByUserid(userid);
	}
	public List <User> getUserByName(String username) 
	{
		return userRepo.findByUsername(username);
	}
}