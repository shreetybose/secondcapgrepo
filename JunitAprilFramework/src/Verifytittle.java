import org.junit.Assert;
import org.junit.Test;

public class Verifytittle {
	
	@Test
	public void verifyhubname()
	{
		String Exptittle="Automation Test Hub";
		String acttittle="Automation Test Hub 12345";
		
	/*	if(acttittle.equals(Exptittle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		} */
		
		//you can rather save these many lines of code just by using one line of code i.e Asserts
		
		try
		{
		Assert.assertEquals(Exptittle, acttittle);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
//Here we use try catch so that due to the mismatch of string the execution should not get stopped rather it should continue with the next step
	       		
	    System.out.println("Execution completed");
		
	}
   
	@Test
	public void verifytittle2()
	{
		String Exptittle2="vtiger";
		String acttittle2="vtiger";
		Assert.assertEquals(Exptittle2, acttittle2);
		System.out.println("Execution completed");
	}
	
	
	
	
}
