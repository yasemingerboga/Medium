package com.atmosware.unitTestingDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import com.atmosware.unitTestingDemo.entities.Student;
import com.atmosware.unitTestingDemo.exceptions.BusinessException;

public class StudentManager {
	public List<Student> students = new ArrayList<Student>();

	public StudentManager() {
		students.add(new Student(1, "Engin", 5));
		students.add(new Student(2, "Ahmet", 4));
		students.add(new Student(3, "Alihaydar", 7));
		students.add(new Student(4, "Berkan", 15));
		students.add(new Student(5, "Burak", 12));
	}

	// int add(Student) ögrenciyi listeye eklesin
	// success:1
	// fail:0
	// ögrenci ismi tekrar edemez

	public int add(Student student) {
		checkIfStudentExists(student);
		checkIfStudentAgeInRangeFourAndTwelve(student);
		students.add(student);
		return 1;
	}

	public void checkIfStudentExists(Student student) {
		for (Student checkStudent : students) {
			if (checkStudent.getName().toLowerCase().equals(student.getName().toLowerCase())) {
				throw new BusinessException("Student cannot added");
			}
		}
	}

	public void checkIfStudentAgeInRangeFourAndTwelve(Student student) {
		if (student.getAge() < 4 || student.getAge() > 12) {
			throw new BusinessException("Students age is out of range.");
		}
	}
}
