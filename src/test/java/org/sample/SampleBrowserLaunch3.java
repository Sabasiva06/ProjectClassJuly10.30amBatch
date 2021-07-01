package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleBrowserLaunch3 {

	@Test
	public void test20() {
		System.out.println("test20");

	}

	@Test
	public void test24() {
		System.out.println("Test24");
		Assert.assertTrue(false);
	}

	@Test
	public void test22() {
		System.out.println("Test22");
	}

	@Ignore
	@Test
	public void test23() {
		System.out.println("Test23");

	}

	@Test
	public void test21() {
		System.out.println("Test21");
	}
}
