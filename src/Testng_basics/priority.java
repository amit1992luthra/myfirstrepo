package Testng_basics;

import org.testng.annotations.Test;

public class priority {
	/*
	@Test(priority = 1)
	public void test()
	{
		System.out.println("test");
	}
	
	@Test(priority = 3)
	public void selenium()
	{
		System.out.println("selenium");
	}
	
	@Test(priority = 2)
	public void day()
	{
		System.out.println("day");
	}*/
	
	
	@Test(enabled = false)
	public void test()
	{
		System.out.println("test");
	}
	
	int obj = 5;
	
	@Test(invocationCount = 5)
	public void selenium()
	{
		System.out.println("selenium");
	}
	
	@Test()
	public void day()
	{
		System.out.println("day");
	}
	
	

}
