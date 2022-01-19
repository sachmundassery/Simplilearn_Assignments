package com.springboot;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class LibraryApplicationTests {

	private final MockMvc mvc;

	public LibraryApplicationTests(MockMvc mvc) {
		this.mvc = mvc;
	}

	@BeforeAll
	static void thisRunsBeforeAllTests() {
		System.out.println("Before ALL run");
	}

	@BeforeEach
	void thisRunsBeforeEach() {
		System.out.println("Before each run");
	}

	@Test
	void thisIsMyFirstTest() {
		Assertions.assertTrue(true);
	}

	@Test
	void thisIsMySecondTest() {
		Assertions.assertTrue(false);
	}

	@Test
	void actualTest() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST, "/books/add"));
		this.mvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/books/all"))
				.andExpect(r -> System.out.println(r.getResponse().getContentAsString()));
	}

	@AfterAll
	static void thisRunsOnceAfterAllTests() {
		System.out.println("I ran once after all tests");
	}

}
