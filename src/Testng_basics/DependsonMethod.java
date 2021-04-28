package Testng_basics;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	
	@Test(dependsOnMethods = {"testLogin"})
	public void testAccount()
	 
	{
	System.out.println("Account has been created");
	 
	}

	@Test()
	public void EnterCredentials()
	 
	{
	
	System.out.println("Enter Credentials");
	 
	}
	
	@Test(dependsOnMethods = {"EnterCredentials"})
	public void testLogin()
	 
	{
	
	System.out.println("login done");
	 
	}
	 
	
	 
	@Test(dependsOnMethods={"testLogin","testAccount"})
	 
	public void testLogout()
	 
	{
	System.out.println("logout");
	 
	}
	
	
}
