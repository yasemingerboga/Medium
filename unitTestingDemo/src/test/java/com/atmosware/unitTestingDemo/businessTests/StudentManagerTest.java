package com.atmosware.unitTestingDemo.businessTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.atmosware.unitTestingDemo.business.concretes.StudentManager;
import com.atmosware.unitTestingDemo.entities.Student;
import com.atmosware.unitTestingDemo.exceptions.BusinessException;

public class StudentManagerTest {

	// unit test runs like a async..
	StudentManager manager;

	// runs before every method
	@BeforeEach
	public void setUp() {
		manager = new StudentManager();
	}

//	@AfterEach
//	public void clean() {
//
//	}
//
//	// it runs just once, before the all methods run
//	@BeforeAll
//	public void start() {
//
//	}
//
//	// it runs just once, after the all methods run
//	@AfterAll
//	public void finish() {
//
//	}

	@Test
	public void student_add_with_same_name() {
		Student student = new Student();
		student.setId(1);
		student.setName("Engin");
		Assertions.assertThrows(BusinessException.class, () -> manager.add(student));
	}

	@Test
	public void student_add_with_different_name() {
		Student student = new Student();
		student.setId(1);
		student.setName("Yasemin");
		student.setAge(8);
		int actual = manager.add(student);
		Assertions.assertEquals(1, actual);

	}

	@Test
	public void student_add_successfully() {
		Student student = new Student();
		student.setId(1);
		student.setName("Yasemin");
		student.setAge(8);
		int exceptedId = 1;
		String exceptedName = "Yasemin";

		int result = manager.add(student);
		Assertions.assertEquals(1, result);

		String actualName = manager.students.get(5).getName();
		int actualId = manager.students.get(5).getId();

		Assertions.assertEquals(exceptedId, actualId);
		Assertions.assertEquals(exceptedName, actualName);
	}

	@Test
	public void student_add_with_valid_age_successfully() {
		Student student = new Student();
		student.setId(1);
		student.setName("Yasemin");
		student.setAge(6);
		int exceptedId = 1;
		String exceptedName = "Yasemin";
		int exceptedAge = 6;

		int result = manager.add(student);
		Assertions.assertEquals(1, result);

		String actualName = manager.students.get(5).getName();
		int actualId = manager.students.get(5).getId();
		int actualAge = manager.students.get(5).getAge();

		Assertions.assertEquals(exceptedId, actualId);
		Assertions.assertEquals(exceptedName, actualName);

		Assertions.assertEquals(exceptedAge, actualAge);

	}

	@Test
	public void student_add_with_invalid_age_successfully() {
		Student student = new Student();
		student.setId(1);
		student.setName("Yasemin");
		student.setAge(25);

		Assertions.assertThrows(BusinessException.class, () -> manager.add(student));
	}
}
