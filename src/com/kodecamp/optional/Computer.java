package com.kodecamp.optional;

import java.util.Optional;

public class Computer {

	private String name;
	private Motherboard motherBoard;

	public Computer() {

	}

	public Computer(final String name) {
		this.name = name;
	}

	public Computer(final String name, final Motherboard motherBoard) {
		this.name = name;
		this.motherBoard = motherBoard;
	}

	public String getName() {
		return name;
	}

	public Motherboard getRiskyMotherBoard() {
		return motherBoard;
	}

	public Optional<Motherboard> getMotherBoard() {

		return Optional.ofNullable(this.motherBoard);
	}

	public  String toString() {

		return"Computer :" +name;
	}

}
