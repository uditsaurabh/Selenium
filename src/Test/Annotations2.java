package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("this is before suite from 2");
	}
	@Test(dependsOnMethods={"B","C"})
	public void A()
	{
		System.out.println("this is executed first");
	}
	@Test(dependsOnMethods={"C"})
	public void B()
	{
		System.out.println("this is executed second");
	}
	@Test
	public void C()
	{
		System.out.println("this is executed third");
	}
	
}
