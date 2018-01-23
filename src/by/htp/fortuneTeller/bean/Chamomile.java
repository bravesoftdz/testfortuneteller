package by.htp.fortuneTeller.bean;

import java.util.Random;

import by.htp.fortuneTeller.logic.Constant;

public class Chamomile {

	private int petal;

	private String name;

	Random random = new Random();

	public Chamomile(String name, int petal) {
		this.setName(name);
		this.petal = random.nextInt(Constant.MAX_RANDOM - Constant.MIN_RANDOM + 1) + Constant.MAX_RANDOM;
	}

	public int getPetal() {
		return petal;
	}

	public void setPetal(int petal) {
		this.petal = petal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
