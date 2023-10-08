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

import com.edubridge.model.Course;
import com.edubridge.model.User;
import com.edubridge.services.CourseService;
import com.edubridge.services.UserService;
@SpringBootTest
class CourseTest {
	@Autowired 
	private CourseService courseService;
	static Course course;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		course=new Course();
    course.setId(43);
    course.setCourseid("8725");
    course.setCoursename("Html");
  
    course.setCoursetype("Youtube");
    course.setDescription("Html is a Hyper Text Markup Language");
    course.setEnrolledcount("2");
    course.setEnrolleddate("2023-10-05");
    course.setInstructorinstitution("Edubridge Learning pvt ltd");
    course.setInstructorname("Subhash Tekale");
    course.setLanguage("English");
    course.setSkilllevel("Advanced");
    course.setWebsiteurl("http://html.com");
    course.setYoutubeurl("JVG-yX2PWXw");

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
    
    	assertNotNull(courseService.saveCourse(course));
		
		
	}
    void testGetAllCourses() {
        
    	assertNotNull(courseService.getAllCourses());
	}
    
 void testFetchCourseByCoursename() {
        
    	assertNotNull(courseService.fetchCourseByCoursename("Html"));
	}
    
 void testFetchCourseByCourseid() {
     
 	assertNotNull(courseService.fetchCourseByCourseid("8584"));
	}
 void testFetchByInstructorname() {
     
	 	assertNotNull(courseService.fetchByInstructorname("Subhash Tekale"));
		}
	 
 void testFetchByInstructorinstitution() {
     
	 	assertNotNull(courseService.fetchByInstructorinstitution("Edubridge Learning pvt ltd"));
		}
 void testFetchByEnrolleddate() {
     
	 	assertNotNull(courseService.  fetchByEnrolleddate("2023-10-05"));
		}
 void testFetchByCoursetype() {
     
	 	assertNotNull(courseService. fetchByCoursetype("Youtube"));
		}
 void testFetchByWebsiteurll() {
     
	 	assertNotNull(courseService.  fetchByWebsiteurl("http://html.com"));
		}
 void testFetchBySkilllevel() {
     
	 	assertNotNull(courseService.  fetchBySkilllevel("Advanced"));
		}
 void testFetchByYoutubeurl() {
     
	 	assertNotNull(courseService. fetchByYoutubeurl("1JWb02x_cJo"));
		}
 void testFetchByLanguage() {
     
	 	assertNotNull(courseService. fetchByLanguage("English"));
		}
	 

}
