package com.graysonautomation.datadrivenskeleton.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.graysonautomation.datadrivenskeleton.suite.HashMapSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({HashMapSuite.class})

public class HashMapRunner {
	
	private HashMapRunner() {	
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
