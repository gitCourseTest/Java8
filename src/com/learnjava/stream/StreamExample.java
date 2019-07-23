package com.learnjava.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

import sun.print.PeekGraphics;

public class StreamExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

		// students name and their activities in a map.
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
//				.filter((student -> student.getGradeLevel() >= 3))
				.peek(student -> {//con peek podemos ver los datos de salida en cada filtro
					System.out.println("*** stream:: "+student);
				})
				.filter(studentPredicate)
				.peek((student -> {
					System.out.println("--- After 1st filter:: " + student);
				}))
				.filter(studentGpaPredicate)
				.peek((student -> {
					System.out.println(">>> After 2nd filter:: " + student);
				})).collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);
	}

}
