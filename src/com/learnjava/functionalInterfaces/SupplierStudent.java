package com.learnjava.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDataBase;

public class SupplierStudent {
	
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = ()->{
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents(); 
		
		System.out.println("Student is:: " + studentSupplier.get());
		System.out.println("Students is:: " + studentsSupplier.get());
	}
	

}
