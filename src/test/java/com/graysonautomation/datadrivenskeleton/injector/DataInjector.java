package com.graysonautomation.datadrivenskeleton.injector;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.graysonautomation.datadrivenskeleton.data.TestDataProvider;

public class DataInjector {

	public DataInjector() {
		testDataProvider = new TestDataProvider();
	}

	private TestDataProvider testDataProvider;

	@SuppressWarnings("unchecked")
	public LinkedHashMap<Integer, Character>[] injectHashMap() {

		// Populate array of HashMaps
		List<LinkedHashMap<Integer, Character>> dataToInject = testDataProvider.getSampleHashMap();

		// Transform to object array and return
		return dataToInject.toArray(new LinkedHashMap[dataToInject.size()]);
	}

	@SuppressWarnings("unchecked")
	public List<String>[] injectArray() {

		// Populate array
		List<ArrayList<String>> dataToInject = testDataProvider.getSampleArray();

		// Transform to object array and return
		return dataToInject.toArray(new ArrayList[dataToInject.size()]);
	}

}
