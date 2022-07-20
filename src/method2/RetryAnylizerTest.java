package method2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnylizerTest implements IRetryAnalyzer {

	int count =0;
	int maxCount=15;
	public boolean retry(ITestResult result) {
		if(count<maxCount) {
			System.out.println("Retrying"+result.getName()
			+"again and count is" +(count+1));
			count++;
			return true;
		}
		return false;
		
	}
}
