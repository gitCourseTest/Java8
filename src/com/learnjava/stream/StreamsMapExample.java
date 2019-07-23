package com.learnjava.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class StreamsMapExample {
/**
 * Map is basically use to convert one type to another type.
 * @return
 */
	public static List<String> getStudentsNameList() {
		List<String> studentsName = StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName)//Stream<String>
				.map(String::toUpperCase)//Stream<String> -> apply uppercase method on each method
				.collect(Collectors.toList());//List<String>
		
		return studentsName;
	}
	
	public static Set<String> getStudentsNameSet() {
		Set<String> studentsName = StudentDataBase.getAllStudents().stream()//Stream<Student>
				.map(Student::getName)//Stream<String>
				.map(String::toUpperCase)//Stream<String> -> apply uppercase method on each method
				.collect(Collectors.toSet());//Set<String>
		
		return studentsName;
	}

	public static void main(String[] args) {
		System.out.println(getStudentsNameList());
		System.out.println(getStudentsNameSet());
	}

}
