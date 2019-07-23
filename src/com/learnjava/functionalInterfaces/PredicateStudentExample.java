package com.learnjava.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class PredicateStudentExample {
	
	static Predicate<Student> p1GradeLevelGraterOrEqualThanThree = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2Gpa = (student) -> student.getGpa() >= 3.9;
	
	public static void filterStudentByGradeLevel() {
		System.out.println("result from filterStudentByGradeLevel method");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if(p1GradeLevelGraterOrEqualThanThree.test(student))
				System.out.println(student);
		}));
	}
	
	public static void filterStudentByGpa() {
		System.out.println("result from filterStudentByGpa method");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if(p2Gpa.test(student))
				System.out.println(student);
		}));
	}
	
	public static void filterStudentsAnd() {
		System.out.println("result from filterStudents method");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if(p1GradeLevelGraterOrEqualThanThree.and(p2Gpa).test(student))
				System.out.println(student);
		}));
	}
	
	public static void filterStudentsOr() {
		System.out.println("result from filterStudentsOr method");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if(p1GradeLevelGraterOrEqualThanThree.or(p2Gpa).test(student))
				System.out.println(student);
		}));
	}
	
	public static void filterStudentsOrNegate() {
		System.out.println("result from filterStudentsOrNegate method");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if(p1GradeLevelGraterOrEqualThanThree.or(p2Gpa).negate().test(student))
				System.out.println(student);
			else
				System.out.println(student);
		}));
	}
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGpa();
		filterStudentsAnd();
		filterStudentsOr();
		filterStudentsOrNegate();
	}

}
