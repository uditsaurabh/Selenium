package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("this is before suite from 1");
	}
	@BeforeTest
	public void classStartup()
	{
		System.out.println("this is class startup");
	}
	@BeforeMethod
	public void startUp()
	{
		System.out.println("this is startup");
	}
	
    @AfterMethod
    public void CloseBrowser()
    {
    	System.out.println("Close the browser for each method");
    }
    @AfterTest
    public void close()
    {
    	System.out.println("Close all the other resources");
    }
	@Test
	public void AopenBrowser()
	{
		System.out.println("the Abrowser is opened");
	}
	@Test
	public void FlightBooking()
	{
		System.out.println("flight bookings");
	}
	
}
