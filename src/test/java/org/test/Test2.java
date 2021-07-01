package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	private void tc20() {
		System.out.println("Method1");
	}

	@Test
	private void tc21() {
		System.out.println("Method2");
	}

	@Test
	private void tc22() {
		System.out.println("Method3");
	}

	@Test
	private void tc23() {
		Assert.assertTrue(false);
		System.out.println("Method4");
	}

	@Test
	private void tc24() {
		System.out.println("Method5");
	}
}
