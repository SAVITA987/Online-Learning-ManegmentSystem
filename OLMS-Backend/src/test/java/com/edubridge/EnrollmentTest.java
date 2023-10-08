package com.edubridge;

import com.edubridge.model.Enrollment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edubridge.model.Chapter;
import com.edubridge.model.Course;
import com.edubridge.services.CourseService;
import com.edubridge.services.EnrollmentService;

@SpringBootTest
	class EnrollmentTest {
		@Autowired 
		private EnrollmentService enrollmentService;
		static Enrollment enrollment;
		
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		enrollment=new Enrollment();
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
	void testGetAllEnrollments() {
		assertNotNull(enrollmentService.getAllEnrollments());
	}
    @Test
	void testFetchByCoursename() {
		assertNotNull(enrollmentService.fetchByCoursename("Core Java"));
	}
    @Test
	void testFetchByCourseid() {
		assertNotNull(enrollmentService.fetchByCourseid("8584"));
	}
    @Test
	void testFetchByEnrolledusername() {
		assertNotNull(enrollmentService.fetchByEnrolledusername("savita"));
	}
    @Test
	void testFetchByEnrolleduserid() {
		assertNotNull(enrollmentService.fetchByEnrolleduserid("4"));
	}
    @Test
	void testFetchByEnrolledusertype() {
		assertNotNull(enrollmentService.fetchByEnrolledusertype("professor"));
	}
	
    @Test
   	void testFetchByInstructorname() {
   		assertNotNull(enrollmentService.fetchByInstructorname("Viraj Barde"));
   	}
	
    @Test
   	void testFetchByInstructorinstitution() {
   		assertNotNull(enrollmentService.fetchByInstructorinstitution("EduBridge Learning pvt ltd"));
   	}
	
    @Test
   	void testFetchByEnrolleddate() {
   		assertNotNull(enrollmentService.fetchByEnrolleddate("2023-10-03"));
   	}
//    @Test
//   	void testFetchByWebsiteurl() {
//   		assertNotNull(enrollmentService.fetchByWebsiteurl(""));
//   	}
    @Test
   	void testFetchByCoursetype() {
   		assertNotNull(enrollmentService.fetchByCoursetype("Youtube"));
   	}
    @Test
   	void testFetchBySkilllevel() {
   		assertNotNull(enrollmentService.fetchBySkilllevel("Advanced"));
   	}
    @Test
   	void testFetchByLanguage() {
   		assertNotNull(enrollmentService.fetchByLanguage("English"));
   	}
	
	
	

}
