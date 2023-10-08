package com.edubridge.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.model.Professor;
import com.edubridge.model.User;
import com.edubridge.services.ProfessorService;
import com.edubridge.services.UserService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class RegistrationController 
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProfessorService professorService;
	
	@PostMapping("/registeruser")

	public User registerUser(@RequestBody User user) throws Exception
	{
		String currEmail = user.getEmail();
		String newID = getNewID();
		user.setUserid(newID);
		
		if(currEmail != null || !"".equals(currEmail))
		{
			User userObj = userService.fetchUserByEmail(currEmail);
			if(userObj != null)
			{
				throw new Exception("User with "+currEmail+" already exists !!!");
			}
		}
		User userObj = null;
		userObj = userService.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/registerprofessor")

	public Professor registerProfessor(@RequestBody Professor professor) throws Exception
	{
		String currEmail = professor.getEmail();
		String newID = getNewID();
		professor.setProfessorid(newID);
		
		if(currEmail != null || !"".equals(currEmail))
		{
			Professor professorObj = professorService.fetchProfessorByEmail(currEmail);
			if(professorObj != null)
			{
				throw new Exception("Professor with "+currEmail+" already exists !!!");
			}
		}
		Professor professorObj = null;
		professorObj = professorService.saveProfessor(professor);
		return professorObj;
	}
	
	public String getNewID()
	{
		String AlphaNumericString = "0123456789"+"0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) 
        {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
	}
}