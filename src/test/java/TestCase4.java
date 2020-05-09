import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase4 {
	
	@Test
	public void tc1()
	{
		throw new SkipException("Skipped!!");
		//System.out.println("This is TC1 of TC4 class!!");
	}
	
	@Test
	public void tc2()
	{
		System.out.println("This is TC2 of TC4 class!!");
	}
	
	@Test
	public void tc3()
	{
		System.out.println("This is TC3 of TC4 class!!");
	}

}
