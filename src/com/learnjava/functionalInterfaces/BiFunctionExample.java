package com.learnjava.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class BiFunctionExample {
	//BiFunction< parameter1, parameter2, returnType> biFunction
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate)-> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			if(studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1GradeLevelGraterOrEqualThanThree));
	}

}
