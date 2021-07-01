package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleBrowserLaunch4 {

	@Test
	public void test10() {
		System.out.println("test10");

	}

	@Ignore
	@Test
	public void test14() {
		System.out.println("Test14");
	}

	@Test
	public void test12() {
		System.out.println("Test12");
	}

	@Test
	public void test13() {
		System.out.println("Test13");
	}

	@Test
	public void test11() {
		System.out.println("Test11");
	}
}
