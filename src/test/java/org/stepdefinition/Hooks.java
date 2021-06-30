package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		launchBrowser();
		maximize();
		System.out.println("Test Starts = "+new Date());
         
	}
	@After
	public void afterScenario(Scenario s ) throws IOException {
		
		
//		Failed Scenarios Screenshot
		if(s.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenShot, "image/png");
		}
		
		
//		String str = s.getName();
//		String name = str.replaceAll(" ", "_");
//		takeScreenshot(name);
		System.out.println("Test ends = "+new Date());
		
	}

}
