package by.htp.fortuneTeller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

import by.htp.fortuneTeller.bean.Chamomile;
import by.htp.fortuneTeller.logic.InitializationMap;

public class TestAppClass {

	private Map<String, List<String>> newMap;
	private Map<String, List<String>> map = new HashMap<String, List<String>>();
	private List<String> setLove = new ArrayList<String>();
	private List<String> setMoney = new ArrayList<String>();
	private List<String> setHappy = new ArrayList<String>();
	private String nameEmptyFlower;

	@Before
	public void initTestData() {
		// LOVE
		setLove.add("Love");
		setLove.add("Not Love");
		setLove.add("Big Love");
		setLove.add("Unrequited Love");
		// MONEY
		setMoney.add("Money");
		setMoney.add("No Money");
		// HAPINNES
		setHappy.add("Happy");
		setHappy.add("No Happy");
		// mapCreate
		map.put("Love", setLove);
		map.put("Money", setMoney);
		map.put("Happinnes", setHappy);
	}

	@Before
	public void initNameFlower() {
		Chamomile cammomile = new Chamomile(ConstantTesting.NAME_FLOWER, ConstantTesting.START_PETAL);
		nameEmptyFlower = cammomile.getName();
	}

	@Test
	public void testChammomalePetalsCountGreaterMin() {
		Chamomile cammomile = new Chamomile(ConstantTesting.NAME_FLOWER, ConstantTesting.START_PETAL);
		int realCount = cammomile.getPetal();
		if (realCount < ConstantTesting.MIN_PETAL) {
			fail("Petals count less than min " + realCount);
		} else {
			System.out.println(
					"The test for the minimum value of the number of petals was carried out successfully, received "
							+ realCount);
		}
	}

	@Test
	public void testChammomalePetalsCountGreaterMax() {
		Chamomile cammomile = new Chamomile(ConstantTesting.NAME_FLOWER, ConstantTesting.START_PETAL);
		int realCount = cammomile.getPetal();
		if (realCount > ConstantTesting.MAX_PETAL) {
			fail("Petals count more than max " + realCount);
		} else {
			System.out.println(
					"The test for the maximum value of the number of petals was carried out successfully, received "
							+ realCount);
		}
	}

	@Test
	public void testChammomalePetalsCountGreaterEquallyZero() {
		Chamomile cammomile = new Chamomile(ConstantTesting.NAME_FLOWER, ConstantTesting.START_PETAL);
		int realCount = cammomile.getPetal();
		if (realCount == ConstantTesting.EQUALLY) {
			fail("The number of petals is " + realCount + ".");
		} else {
			System.out.println("The zero inequality test was successful.");
		}
	}

	@Test
	public void testChammomaleNameEqually() {
		Chamomile cammomile = new Chamomile(ConstantTesting.NAME_FLOWER, ConstantTesting.START_PETAL);
		String realName = cammomile.getName();
		if (realName != ConstantTesting.NAME_FLOWER) {
			fail("The name of the flower does not match.");
		} else {
			System.out.println("The name of the flower corresponds to the reference one.");
		}
	}

	@Test
	public void testEqualMap() {
		newMap = InitializationMap.initializationMap();
		assertEquals("The MAPs are not equal.", map, newMap);
	}

	@Test
	public void testMapOptionLove() {
		String optionName = "Love";
		int counterMenu = 0;
		newMap = InitializationMap.initializationMap();
		for (String key : newMap.keySet()) {
			counterMenu++;
			if (key == optionName) {
				assertEquals("The option " + optionName + "(" + counterMenu + ") exists in the menu.", key, optionName);
			}
		}
	}

	@Test
	public void testMapOptionMoney() {
		String optionName = "Money";
		int counterMenu = 0;
		newMap = InitializationMap.initializationMap();
		for (String key : newMap.keySet()) {
			counterMenu++;
			if (key == optionName) {
				assertEquals("The option " + optionName + "(" + counterMenu + ") exists in the menu.", key, optionName);
			}
		}
	}

	@Test
	public void testMapOptionHappinnes() {
		String optionName = "Happinnes";
		int counterMenu = 0;
		newMap = InitializationMap.initializationMap();
		for (String key : newMap.keySet()) {
			counterMenu++;
			if (key == optionName) {
				assertEquals("The option " + optionName + "(" + counterMenu + ") exists in the menu.", key, optionName);
			}
		}
	}

	@Test
	public void testMapOptionEmpty() {
		String optionName = "";
		newMap = InitializationMap.initializationMap();
		for (String key : newMap.keySet()) {
			if (key == optionName) {
				assertEquals("There is empty option.", key, optionName);
			}

		}
	}

	@Test
	public void testNameFlowerEmpty() {
		assertEquals("The name of the flower is not specified in the parameters.", "", nameEmptyFlower);
	}

	@Test
	public void testMinValueLove() {
		int valueLoveGroup = map.get("Love").size();
		if (valueLoveGroup < ConstantTesting.MIN_PETAL) {
			fail("The quantity of answers in the group \"Love\" is not included in the minimum range. GOT:"
					+ valueLoveGroup + " MIN: " + ConstantTesting.MAX_PETAL);
		}
	}

	@Test
	public void testMinValueMoney() {
		int valueLoveGroup = map.get("Money").size();
		if (valueLoveGroup < ConstantTesting.MIN_PETAL) {
			fail("The quantity of answers in the group \"Money\" is not included in the minimum range. GOT:"
					+ valueLoveGroup + " MIN: " + ConstantTesting.MIN_PETAL);
		}
	}

	@Test
	public void testMinValueHappinnes() {
		int valueLoveGroup = map.get("Happinnes").size();
		if (valueLoveGroup < ConstantTesting.MIN_PETAL) {
			fail("The quantity of answers in the group \"Money\" is not included in the minimum range. GOT:"
					+ valueLoveGroup + " MIN: " + ConstantTesting.MIN_PETAL);
		}
	}

	@Test
	public void testMaxValueLove() {
		int valueLoveGroup = map.get("Love").size();
		if (valueLoveGroup > ConstantTesting.MAX_PETAL) {
			fail("The quantity of answers in the group \"Love\" is not included in the maximum range. GOT:"
					+ valueLoveGroup + " MAX: " + ConstantTesting.MAX_PETAL);
		}
	}

	@Test
	public void testMaxValueMoney() {
		int valueLoveGroup = map.get("Money").size();
		if (valueLoveGroup > ConstantTesting.MAX_PETAL) {
			fail("The quantity of answers in the group \"Money\" is not included in the maximum range. GOT:"
					+ valueLoveGroup + " MAX: " + ConstantTesting.MAX_PETAL);
		}
	}

	@Test
	public void testMaxValueHappinnes() {
		int valueLoveGroup = map.get("Happinnes").size();
		if (valueLoveGroup > ConstantTesting.MAX_PETAL) {
			fail("The quantity of answers in the group \"Money\" is not included in the maximum range. GOT:"
					+ valueLoveGroup + " MAX: " + ConstantTesting.MAX_PETAL);
		}
	}

}
