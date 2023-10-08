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
import com.edubridge.model.Course;
import com.edubridge.services.ChapterService;
import com.edubridge.services.CourseService;
@SpringBootTest
class ChapterTest {
	@Autowired 
	private ChapterService chapterService;
	static Chapter chapter;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		chapter=new Chapter();
		chapter.SetId(43);
		chapter.setChapter1id("https://www.javatpoint.com/html-tutorial");
		chapter.setChapter1name("Basics Of HTML ");
		chapter.setChapter2id("https://www.javatpoint.com/html-tags");
		chapter.setChapter2name("HTML tags");
		chapter.setChapter3id("https://www.javatpoint.com/html-formatting");
		chapter.setChapter3name("HTML Formatting");
		chapter.setChapter4id("https://www.javatpoint.com/html-anchor");
		chapter.setChapter4name("HTML Anchor");
		chapter.setChapter5id("https://www.javatpoint.com/html-script-tag");
		chapter.setChapter5name("HTML Script Tag");
		chapter.setChapter6id("https://www.javatpoint.com/html-audio");
		chapter.setChapter6name("HTML Audio Tag");
		chapter.setChapter7id("https://www.javatpoint.com/html-lists");
		chapter.setChapter7name("HTML Lists");
		chapter.setChapter8id("https://www.javatpoint.com/html-form");
		chapter.setChapter8name("HTML From");
		
		chapter.setCoursename("Html");
		
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
		assertNotNull(chapterService.saveChapter(chapter));
	}
	
	void testGetAllChapters() {
		assertNotNull(chapterService.getAllChapters());
	}
//	void testAddNewChapter() {
//		assertNotNull(chapterService.addNewChapter("inheritance"));
//	}
	void testFetchByCoursename() {
		assertNotNull(chapterService.fetchByCoursename("Core Java"));
	}
	
	
}
