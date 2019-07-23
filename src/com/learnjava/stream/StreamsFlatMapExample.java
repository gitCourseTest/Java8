package com.learnjava.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static List<String> printStudentActivities(){
		
		List<String> activities = StudentDataBase.getAllStudents().stream()//Stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//Stream<String>
		.collect(Collectors.toList());
		
		return activities;
	}
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}

}
