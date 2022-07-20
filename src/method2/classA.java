package method2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class classA {
	@Test()
	public void TestNG1() {
		System.out.println("Test class 1");
		Assert.assertTrue(true);
	}
	@Test
	public void TestNG2() {
		System.out.println("Test class 2");
		Assert.assertTrue(false);
	}
	@Test
	public void TestNG3() {
		System.out.println("Test class 3");
		Assert.assertTrue(false);
	}

}
