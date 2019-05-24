package com.graysonautomation.datadrivenskeleton.suite;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Assume;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.graysonautomation.datadrivenskeleton.bug.BugCatcher;
import com.graysonautomation.datadrivenskeleton.injector.DataInjector;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class ArraySuite {
	
	// Field for injected HashMap
	private List<String> injectedArray;
	
	// Constructor injection
	public ArraySuite(List<String> injectedArray) {
		this.injectedArray = injectedArray;
	}
	
	// Data injection method
	@Parameters
	public static Iterable<Object> dataFeed() {
		DataInjector dataInjector = new DataInjector();
		return Arrays.asList(dataInjector.injectArray());
	}
	
	// Catches any failed assertions and allows you to do stuff before re-throwing the error back to JUnit
	@Rule
	public BugCatcher bugCatcher = new BugCatcher();
	
	  /****************************/
     /*** Populate tests below ***/
    /****************************/
	
	@Test
	public void exampleTest() {
		Assume.assumeTrue(!injectedArray.isEmpty());
		System.out.println(injectedArray);
		assertThat(true).isTrue();
	}
	
	@Test
	public void catchTheBug() {
		assertThat(true).isFalse();
	}
}
