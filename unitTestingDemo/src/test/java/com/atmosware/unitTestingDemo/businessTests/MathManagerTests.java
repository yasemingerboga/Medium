package com.atmosware.unitTestingDemo.businessTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.atmosware.unitTestingDemo.business.concretes.MathManager;

public class MathManagerTests {

	@Test
	public void one_plus_seven_is_eight() {
		// arrange
		// open swagger, open end point
		MathManager manager = new MathManager();
		int number1 = 1;
		int number2 = 7;
		int excepted = 8;

		// act
		// try it out - execute, click button
		int actual = manager.add(number1, number2);

		// assert
		// check
		Assertions.assertEquals(excepted, actual);

	}
}
