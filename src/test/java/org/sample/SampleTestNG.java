package org.sample;

import org.testng.annotations.Test;

public class SampleTestNG {

	@Test
	private void tc0() {
		System.out.println("Method 0");

	}

	@Test
	private void tc1() {
		System.out.println("Method 1");

	}

	@Test
	private void tc2() {
		System.out.println("Method 2");

	}

	@Test(invocationCount=10)
	private void tc3() {
		System.out.println("Method 3");

	}

	@Test(enabled=false)
	private void tc4() {
		System.out.println("Method 4");

	}

	@Test
	private void tc5() {
		System.out.println("Method 5");

	}

}
