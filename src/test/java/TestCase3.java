import org.testng.annotations.Test;

public class TestCase3 {
	
	
	
	@Test
	public void tc1()
	{
		System.out.println("This is TC1 of TC3 class!!");
	}
	
	@Test(enabled=false)
	public void tc2()
	{
		System.out.println("This is TC2 of TC3 class!!");
	}
	
	@Test
	public void tc3()
	{
		System.out.println("This is TC3 of TC3 class!!");
	}

}
