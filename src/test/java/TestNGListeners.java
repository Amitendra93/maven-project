import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener  {

	public void onFinish(ITestContext arg0) {
		
		
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed !!"+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Skipped !!"+ result.getName());
	}

	public void onTestStart(ITestResult result) {
		
		System.out.println("Started !!"+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Success !!"+ result.getName());
	}

}
