package by.htp.fortuneTeller.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitializationMap {

	static Map<String, List<String>> map = new HashMap<String, List<String>>();

	public static Map<String, List<String>> initializationMap() {

		List<String> setLove = new ArrayList<String>();

		setLove.add("Love");
		setLove.add("Not Love");
		setLove.add("Big Love");
		setLove.add("Unrequited Love");

		List<String> setMoney = new ArrayList<String>();

		setMoney.add("Money");
		setMoney.add("No Money");

		List<String> setHappy = new ArrayList<String>();

		setHappy.add("Happy");
		setHappy.add("No Happy");

		map.put("Love", setLove);
		map.put("Money", setMoney);
		map.put("Happinnes", setHappy);

		return map;

	}

}
