package com.graysonautomation.datadrivenskeleton.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.graysonautomation.datadrivenskeleton.suite.ArraySuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArraySuite.class})

public class ArrayRunner {
	
	private ArrayRunner() {	
	}

	@BeforeClass
	public static void setUp() {
		// Do stuff before class but not before parameters method
	}

	@AfterClass
	public static void tearDown() {
		// Do stuff after class
	}

}
