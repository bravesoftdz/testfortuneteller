package by.htp.fortuneTeller.logic;

import by.htp.fortuneTeller.bean.Chamomile;

public class ReadFortune {

	public void readFortune(Chamomile chamomile) {

		InitializationMap initializationMap = new InitializationMap();

		if (chamomile.getPetal() <= 0) {
			System.out.println("Take new flower");
			return;
		}

		switch (FortuneTeller.addUser()) {
		case 1:
			if (chamomile.getPetal() % initializationMap.map.get("Money").size() == 0) {
				System.out.println(initializationMap.map.get("Money").get(1));
			} else {
				System.out.println(initializationMap.map.get("Money").get(0));
			}
			break;
		case 2:
			if (chamomile.getPetal() % initializationMap.map.get("Love").size() == 0) {
				System.out.println(initializationMap.map.get("Love").get(3));
			} else if (chamomile.getPetal() % initializationMap.map.get("Love").size() == 1) {
				System.out.println(initializationMap.map.get("Love").get(0));
			} else if (chamomile.getPetal() % initializationMap.map.get("Love").size() == 2) {
				System.out.println(initializationMap.map.get("Love").get(1));
			} else if (chamomile.getPetal() % initializationMap.map.get("Love").size() == 3) {
				System.out.println(initializationMap.map.get("Love").get(2));
			}
			break;
		case 3:
			if (chamomile.getPetal() % initializationMap.map.get("Happinnes").size() == 0) {
				System.out.println(initializationMap.map.get("Happinnes").get(1));
			} else {
				System.out.println(initializationMap.map.get("Happinnes").get(0));
			}
			break;
		}

	}

}
