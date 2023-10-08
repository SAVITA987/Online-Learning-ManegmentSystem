package com.edubridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edubridge.model.Professor;
import com.edubridge.model.User;
import com.edubridge.services.ProfessorService;
import com.edubridge.services.UserService;
@SpringBootTest
class ProfessorControllerTest {
	@Autowired 
	private ProfessorService professorService;
	static  Professor  professor;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		professor=new Professor();
		professor.setEmail("pavitra@gmail.com");
        professor.setProfessorname("Pavitra");
        professor.setProfessorid("1234");
        professor.setDegreecompleted("2018");
        professor.setInstitutionname("Edubridge");
        professor.setDepartment("CSE");
        professor.setExperience("3");
        professor.setMobile("9876098765");
        professor.setPassword("Pavitra@123");
//        professor.setStatus(null);

		
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
		assertNotNull(professorService.saveProfessor(professor));
		
	}
    @Test
	void testGetAllProfessors() {
		assertNotNull(professorService.getAllProfessors());
		
	}
    @Test
	void testGetProfessorListByEmail() {
		assertNotNull(professorService.getProfessorListByEmail("tekale@gmail.com"));
		
	}
   
    @Test
   	void testGetProfessorById() {
   		assertNotNull(professorService. getProfessorById("1"));
   		
   	}
    @Test
   	void testFetchProfessorByEmail() {
   		assertNotNull(professorService. fetchProfessorByEmail("pavitra12@gmail.com"));
   		
   	}
    
    @Test
   	void testFetchProfessorByProfessorname() {
   		assertNotNull(professorService. fetchProfessorByProfessorname("Pavitra Nagaral"));
   		
   	}
    
    @Test
   	void testFindByEmailAndPassword() {
   		assertNotNull(professorService. fetchProfessorByProfessorname("Pavitra Nagaral"));
   		
   	}
    @Test
   	void testFetchProfileByEmail() {
   		assertNotNull(professorService. fetchProfileByEmail("pavitra12@gmail.com"));
   		
   	}
    
    @Test
   	void testGetProfessorsByEmail() {
   		assertNotNull(professorService. getProfessorsByEmail("amit@gmail.com"));
   		
   	}
    
    @Test
   	void testDeleteProfessorById() {
   		assertNotNull(professorService. deleteProfessorById("0585"));
   		
   	}
    
    

}
