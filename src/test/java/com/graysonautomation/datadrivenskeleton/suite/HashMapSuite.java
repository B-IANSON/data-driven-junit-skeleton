package com.graysonautomation.datadrivenskeleton.suite;

import java.util.Map;

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
public class HashMapSuite {
	
	// Field for injected HashMap
	private Map<Integer, Character> injectedHashMap;
	
	// Constructor injection
	public HashMapSuite(Map<Integer, Character> injectedHashMap) {
		this.injectedHashMap = injectedHashMap;
	}
	
	// Data injection method
	@Parameters
	public static Iterable<Object> dataFeed() {
		DataInjector dataInjector = new DataInjector();
		return Arrays.asList(dataInjector.injectHashMap());
	}
	
	// Catches any failed assertions and allows you to do stuff before re-throwing the error back to JUniy
	@Rule
	public BugCatcher bugCatcher = new BugCatcher();
	
	  /****************************/
     /*** Populate tests below ***/
    /****************************/
	
	@Test
	public void exampleTest() {
		Assume.assumeTrue(!injectedHashMap.isEmpty());
		System.out.println(injectedHashMap);
		assertThat(true).isTrue();
	}
	
	@Test
	public void catchTheBug() {
		assertThat(true).isFalse();
	}
}
