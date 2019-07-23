package com.learnjava.methodreference;

import java.util.function.Predicate;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	static Predicate<Student> p1GradeLevelGraterOrEqualThanThree = RefactorMethodReferenceExample::p1GradeLevelGraterOrEqualThanThree; 
	
	public static boolean p1GradeLevelGraterOrEqualThanThree(Student student) {
		return student.getGradeLevel() >= 3;
	}
		
	public static void main(String[] args) {
		System.out.println(p1GradeLevelGraterOrEqualThanThree.test(StudentDataBase.studentSupplier.get()));
	}

}
