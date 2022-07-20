package com.runFaileTestCase1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void TestNG1() {
		System.out.println("Test class 1");
		Assert.assertTrue(true);
	}
	@Test
	public void TestNG2() {
		System.out.println("Test class 2");
		Assert.assertTrue(false);
	}

}
