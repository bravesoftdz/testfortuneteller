package by.htp.fortuneTeller.logic;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FortuneTeller {

	private static int choise;

	public static int addUser() {

		System.out.println("Even number from 1 to 3");

		Map<String, List<String>> menuMap = InitializationMap.initializationMap();
		int counter = 0;
		for (String key : menuMap.keySet()) {
			counter++;
			System.out.println("\t" + counter + " - " + key);

		}

		Scanner scanner = new Scanner(System.in);
		choise = scanner.nextInt();

		if (choise <= 0 || choise > 3) {
			System.out.println("Wrong choise, Even number from 1 to 3");
			scanner.close();
		} else
			System.out.println("Your prediction is: ");
		return choise;
	}

}
