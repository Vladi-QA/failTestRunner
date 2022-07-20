package com.runFaileTestCase1;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class FailTestRunner {
	@AfterTest
	public void runFailTestCses() {
		//create object test NG class
		TestNG obj = new TestNG();
		List<String>list = new ArrayList<String>();
		list.add("C:\\Users\\localadmin\\eclipse-workspaceDontGiveUp\\testNGDemo\\test-output\\Suite\\testng-failed.xml");
		obj.setTestSuites(list);
		obj.run();
	}

}
         