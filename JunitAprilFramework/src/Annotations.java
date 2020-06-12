import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Annotations {
	
	@Test
	public void testcase1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("test2");
	}
	
	@Before
	public void before()
	{
		System.out.println("This is before Scenario");
		}
	
	@After
	public void after()
	{
		System.out.println("This is after Scenario");
		//In after for e.g:You can put code of logout from application/UI
	}
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("This is before class");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("This is after class");
	}
	
	

}
