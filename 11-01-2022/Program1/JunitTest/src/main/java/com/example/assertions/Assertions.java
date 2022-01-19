package com.example.assertions;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.*;

public class Assertions {

	@Test
	@DisplayName("Assert Examples")
	public void assertTests() {
		
		assertTrue(4>0);
		
	}
}
