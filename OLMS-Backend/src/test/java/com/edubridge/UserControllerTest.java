package com.edubridge;
import com.edubridge.model.User;
import com.edubridge.services.UserService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UserControllerTest {
    
	@Autowired 
	private UserService userService;
	static User user;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		user=new User();
		user.setEmail("savita@gmail.com");
		user.setAddress("bangalore");
		user.setGender("female");
		user.setMobile("8763423398");
		user.setPassword("Savitha@123");
		user.setUserid("savitra123");
		user.setUsername("savitha");
		user.setProfession("Savita123");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
    @Disabled
	@Test
	void test() {
		assertNotNull(userService.saveUser(user));
		
	}

	@Test
	void testGetAllUser() {
		assertNotNull(userService.getAllUsers());
		
	}
	@Test
	void testFetchByUsername() {
		assertNotNull(userService.fetchUserByUsername("Pavitra patil"));
		
	}
	@Test
	void testFetchUserByEmail() {
		assertNotNull(userService.fetchUserByEmail("savitatekale1234@gmail.com"));
		
	}
	@Test
	void testFetchUserByEmailAndPassword() {
		assertNotNull(userService.fetchUserByEmailAndPassword("savitatekale1234@gmail.com","Savita@123"));
		
	}
	@Test
	void testFetchProfileByEmail() {
		assertNotNull(userService.fetchProfileByEmail("partik@gmail.com"));
		
	}
	@Test
	void testDeleteUserById() {
		assertNotNull(userService.deleteUserById("0133"));
		
	}


}
