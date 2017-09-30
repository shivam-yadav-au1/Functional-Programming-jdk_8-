package com.kodecamp.optional;

import java.util.Optional;

public class Motherboard {
	
	private String name;
	private Processor processor;
	
	public Motherboard() {
		
	}
	
	public Motherboard(final String name) {
		this.name=name;
	}
	
	public Motherboard(final String name,final Processor processor) {
		this.name=name;
		this.processor=processor;
	}
	
	public String getName() {
		return name;
	}
	
	public Processor getRiskyProcessor() {
		return processor;
	}
	
	public Optional<Processor> getProcessor(){
		return Optional.ofNullable(this.processor);
	}
	
	public String toString() {
		
		return "MotherBoard :"+name;
	}
	
	public static Motherboard isEmpty() {
		return new Motherboard("MotherBoard is not intalled.");
	}

}
