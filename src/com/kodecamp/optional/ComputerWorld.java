package com.kodecamp.optional;

import java.util.Optional;

public class ComputerWorld {
	
	public static void main(String args[]) {
		
		
		Computer computer = createComputer().orElse(new Computer());
		
//		Computer comp = createComputer().isPresent() ? returnAfterProcessing(createComputer().get()) : "hkhgf";
		
		//if  computer is present then it will process the data otherwise leave it.
		
	
		
	/*	String details = computer.getMotherBoard()
						.orElse(Motherboard.isEmpty())
						.getProcessor()
						.orElse(Processor.isEmpty())
						.details();
		System.out.println(details);*/
		
		
	}
	
	public static Optional<Computer> createComputer() {
//		Computer computer = null;
		
		Computer computer = new Computer("Lenovo");
		
/*		Computer computer = new Computer("Lenovo"
		,new Motherboard("Energy Star"));*/
		
		/*Computer computer = new Computer("Lenovo",
									new Motherboard("Energy Star",
												new Processor("Intel i3")));*/
		return Optional.ofNullable(computer);
	}
	
	public static String returnAfterProcessing(Computer computer) {
		System.out.println("computer is present");
		return "processing computer";
	}
	
	public static void processComputer(Computer computer) {
		System.out.println("Processing computer...");
		System.out.println("Computer name: "+computer.getName());
		computer.getMotherBoard().ifPresent(ComputerWorld::processMotherBoard);
	}
	
	public static void processMotherBoard(Motherboard motherBoard) {
		System.out.println("Processing motherboard... ");
		System.out.println("Motherboard : "+motherBoard.getName());
		motherBoard.getProcessor().ifPresent(ComputerWorld::processProcessor);
	}
	
	public static void processProcessor(Processor processor) {
		System.out.println("Processing processor...");
		System.out.println(processor.details());
	}

}
