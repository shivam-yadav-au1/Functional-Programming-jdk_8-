package com.kodecamp.lamdaexpression;

public class RunLamda {

	/*
	 * Anonymous Class is declared which implements IStudent interface and override
	 * printStudent()
	 * 
	 */

	public static void anonymosClass() {

		IStudent student = new IStudent() {

			Student stu = new Student("654", "shivam");

			@Override
			public void printStudent() {

				System.out.println(stu.id() + " " + stu.name());
			}

		};

		student.printStudent();

	}

	public static void printDetails(IStudent student) {
		student.printStudent();
	}
	
	private static boolean validateStudent(Student student) {
		System.out.println("processing student again...");
		return false;
	}



	public static void main(String args[]) {
		
		//anonymos class 
		 anonymosClass();

		Student stu = new Student("748", "Shivam");

		//lamda expression with one argument
		
		IValidate<Student> validator = (Student student) -> {
			System.out.println("validating student");
			return false;
		};

		validator.validate(stu);
		
		// method mapping 
		
		IValidate<Student> methodRefVaidator = RunLamda::validateStudent;
		methodRefVaidator.validate(stu);
		
		
		
		// lamda expression without argument
		printDetails(() -> {
		 System.out.println(stu.id() + " " + stu.name());
		 });

	
	

	}



}
