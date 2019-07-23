package com.learnjava.methodreference;

import java.util.function.Consumer;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	static Consumer<Student> consumer = student -> System.out.println(student);
	
	/**
	 * className::methodName
	 */
	static Consumer<Student> consumer2 = System.out::println;
	
	/**
	 * className::instanceMethodName
	 */
	static Consumer<Student> consumer3 = Student::printListOfActivities;
	
	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(consumer);
		System.out.println("******************************");
		StudentDataBase.getAllStudents().forEach(consumer2);
		System.out.println("******************************consumer3");
		StudentDataBase.getAllStudents().forEach(consumer3);
		
	} 

}
