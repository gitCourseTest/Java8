package com.learnjava.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;
	BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa >=3.9;
	
	BiConsumer<String, List<String>> studentBiconsumer = (name, activities) -> System.out.println(name + " : " + activities);

	Consumer<Student> studentConsumer = (student -> {
//		if (p1.and(p2).test(student)) {// using predicate
		if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {//using Bipredicate
			studentBiconsumer.accept(student.getName(), student.getActivities());
		}
	});

	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(students);
	}

}
