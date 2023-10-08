package com.edubridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.Professor;
import com.edubridge.model.User;
import com.edubridge.services.ProfessorService;
import com.edubridge.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class LoginController 
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("/")
    public String welcomeMessage()
    {
    	return "Welcome to Elearning Management system !!!";
    }
	
	@PostMapping("/loginuser")

	public User loginUser(@RequestBody User user) throws Exception
	{
		String currEmail = user.getEmail();
		String currPassword = user.getPassword();
		
		User userObj = null;
		if(currEmail != null && currPassword != null)
		{
			userObj = userService.fetchUserByEmailAndPassword(currEmail, currPassword);
		}
		if(userObj == null)
		{
			throw new Exception("User does not exists!!! Please enter valid credentials...");
		}		
		return userObj;
	}
	
	@PostMapping("/loginprofessor")

	public Professor loginDoctor(@RequestBody Professor professor) throws Exception
	{
		String currEmail = professor.getEmail();
		String currPassword = professor.getPassword();
		
		Professor professorObj = null;
		if(currEmail != null && currPassword != null)
		{
			professorObj = professorService.fetchProfessorByEmailAndPassword(currEmail, currPassword);
		}
		if(professorObj == null)
		{
			throw new Exception("Professor does not exists!!! Please enter valid credentials...");
		}		
		return professorObj;
	}
}