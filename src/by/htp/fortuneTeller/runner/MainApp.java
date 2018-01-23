package by.htp.fortuneTeller.runner;

import by.htp.fortuneTeller.bean.Chamomile;
import by.htp.fortuneTeller.logic.InitializationMap;
import by.htp.fortuneTeller.logic.ReadFortune;

public class MainApp {

	public static void main(String[] args) {

		new InitializationMap();

		Chamomile chamomile = new Chamomile("Chamomile", 0);

		ReadFortune readFortune = new ReadFortune();
		readFortune.readFortune(chamomile);
	}
}
