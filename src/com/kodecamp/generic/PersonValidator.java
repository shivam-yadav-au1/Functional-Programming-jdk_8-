package com.kodecamp.generic;

public class PersonValidator<T> implements IValidatorGeneric<Person> {

	/*
	 * @Override public void validate(Object obj) {
	 * 
	 * System.out.println("Validate called."); }
	 */

	@Override
	public void validate(Person x) {

		System.out.println("Generic Validate Called.");

	}
	
	public static void processValidaton(IValidatorGeneric ivalidator,Person person){
		ivalidator.validate(person);
	}
	
	public static void printPerson(Person person) {
		System.out.println("ID of Person: " + person.id() + " Name :" + person.name());
	}
	
	
	
	public static void printPersonDetails() {
		Person person = new Person("6655","shivam");
		System.out.println("printPersonDetails executed.");
		System.out.println("id :"+person.id()+"name :"+person.name());
		
	}

	public static void main(String args[]) {

		Person person = new Person("424", "Shivam");
		// String str = new String("Shivam");

	/*	IValidatorGeneric<Person> personValidator = new IValidatorGeneric<Person>() {

			@Override
			public void validate(Person x) {
				System.out.println("ID of Person: " + x.id() + " Name :" + x.name());

			}

		
		};*/

		IValidatorGeneric<Person> personValidator1 = PersonValidator::printPerson;
		
		IValidatorGeneric<Person> p = ((Person per)->{
			System.out.println("Method executed.");
			System.out.println(per.id()+" "+per.name());
		});
			
		
//		personValidator1.validate(person);
		
//		processValidaton(personValidator1,person);
		
	
		
		
		
		
		
	}
	
	

}
