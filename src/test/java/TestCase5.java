import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class TestCase5 {
	@Test
	public void tc1()
	{
		System.out.println("This is TC1 of TC5 class!!");
	}
	
	@Test
	public void tc2()
	{
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void tc3()
	{
		System.out.println("This is TC3 of TC5 class!!");
	}
}
