package com.graysonautomation.datadrivenskeleton.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class TestDataProvider {

	public List<LinkedHashMap<Integer, Character>> getSampleHashMap() {

		ArrayList<LinkedHashMap<Integer, Character>> arrayOfHashMaps = new ArrayList<>();

		LinkedHashMap<Integer, Character> mapOne = new LinkedHashMap<>();
		mapOne.put(1, 'A');
		mapOne.put(2, 'B');
		mapOne.put(3, 'C');
		arrayOfHashMaps.add(mapOne);

		LinkedHashMap<Integer, Character> mapTwo = new LinkedHashMap<>();
		mapTwo.put(4, 'D');
		mapTwo.put(5, 'E');
		mapTwo.put(6, 'F');
		arrayOfHashMaps.add(mapTwo);

		LinkedHashMap<Integer, Character> mapThree = new LinkedHashMap<>();
		mapThree.put(7, 'G');
		mapThree.put(8, 'H');
		mapThree.put(9, 'I');
		arrayOfHashMaps.add(mapThree);

		return arrayOfHashMaps;
	}

	public List<ArrayList<String>> getSampleArray() {

		ArrayList<ArrayList<String>> arrayOfArrays = new ArrayList<>();

		arrayOfArrays.add(new ArrayList<>(Arrays.asList("Green", "Yellow", "Red")));
		arrayOfArrays.add(new ArrayList<>(Arrays.asList("Car", "Plane", "Train")));
		arrayOfArrays.add(new ArrayList<>(Arrays.asList("Tom", "Dick", "Harry")));

		return arrayOfArrays;
	}
}
