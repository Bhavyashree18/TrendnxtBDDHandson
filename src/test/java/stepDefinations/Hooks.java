package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	
	@Before("@Test")
	public void beforevaldiation()
	{
		System.out.println("The Application started Running");
	}
	
	@After("@Test")
	public void afterScenario()
	{
		driver.close();
	}
	
		
	}

