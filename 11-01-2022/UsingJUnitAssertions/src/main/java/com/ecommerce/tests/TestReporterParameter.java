package com.ecommerce.tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.Test;

public class TestReporterParameter {

	  @BeforeEach
	  void beforeEach(TestInfo testInfo, TestReporter testReporter) {

	    String methodName = testInfo.getTestMethod().get().getName();
	    String reportMessage = String.format("About to execute  %s", methodName);

	    testReporter.publishEntry(reportMessage);
	  }

	  @RepeatedTest(3)
	  void test_Add(RepetitionInfo repetitionInfo, TestReporter testReporter) {
	    String key = "start test_Add() : " + repetitionInfo.getCurrentRepetition();
	    String value = repetitionInfo.getCurrentRepetition() % 2 == 0 ? "FAIL" : "PASS";

	    Map<String, String> reportEntryMap = new HashMap<>();
	    reportEntryMap.put(key, value);

	    testReporter.publishEntry(reportEntryMap);
	  }

	  @AfterEach
	  void afterEach(TestInfo testInfo, TestReporter testReporter) {

	    String methodName = testInfo.getTestMethod().get().getName();
	    String reportMessage = String.format("Execution completed  %s", methodName);

	    testReporter.publishEntry(reportMessage);
	  }
	}