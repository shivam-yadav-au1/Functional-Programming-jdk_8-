package com.kodecamp.optional;

import java.util.Optional;

public class Processor {

	private String name;

	public Processor() {

	}

	public Processor(final String name) {
		this.name = name;
	}

	public String getRiskyProcessor() {
		return name;
	}

	public Optional<String> getProcessor() {

		return Optional.ofNullable(this.name);
	}

	public String details() {

		return "Processor :" + name;
	}
	
	public static  Processor isEmpty() {
		return new Processor("No Processor installed");
	}
	
	public String toString() {
		return "Processor :"+name;
	}

}
