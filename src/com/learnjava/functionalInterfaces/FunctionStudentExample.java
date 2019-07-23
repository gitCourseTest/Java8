package com.learnjava.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			if(PredicateStudentExample.p1GradeLevelGraterOrEqualThanThree.test(student))
				studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	});
	
	public static void main(String[] args) {
		
		List<Student> students = StudentDataBase.getAllStudents();
		Map<String, Double> result = studentFunction.apply(students);
		System.out.println(result);
		
	}

}
