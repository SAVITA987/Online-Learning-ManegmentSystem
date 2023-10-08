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

import com.edubridge.model.Chapter;
import com.edubridge.model.Wishlist;
import com.edubridge.services.ChapterService;
import com.edubridge.services.WishlistService;

@SpringBootTest
class WishlistTest {
	@Autowired 
	private WishlistService wishlistService;
	static Wishlist wishlist;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
		assertNotNull(wishlistService.getAllLikedCourses());
		}
	@Test
	void testFindByCoursename() {
		assertNotNull(wishlistService.fetchCourseByCoursename("Data Analyst"));
		}
	
	@Test
	void testFindByCourseid() {
		assertNotNull(wishlistService.fetchCourseByCourseid("4738"));
		}
	@Test
	void testFindByLikedusertype() {
		assertNotNull(wishlistService.fetchByLikedusertype("admin@gmail.com"));
		}
	@Test
	void testFindByInstructorinstitution() {
		assertNotNull(wishlistService.fetchByInstructorinstitution("EduBridge Learning pvt ltd"));
		}
	@Test
	void testFindByInstructorname() {
		assertNotNull(wishlistService.fetchByInstructorname("Pavani Patil"));
		}@Test
	void testFindByCoursetype() {
			assertNotNull(wishlistService.fetchByCoursetype("Youtube"));
			}
		@Test
		void testFindBySkilllevel() {
			assertNotNull(wishlistService.fetchBySkilllevel("Advanced"));
			}
		@Test
		void testFindByLanguage() {
			assertNotNull(wishlistService.fetchByLanguage("English"));
			}
	}
