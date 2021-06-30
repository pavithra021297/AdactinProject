package org.testrunner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles",glue="org.stepdefinition",
            dryRun=false,monochrome=true,tags= {"@smoke"},
            plugin= {"pretty",
            		"html:src\\test\\resources\\Reports",
            		"json:src\\test\\resources\\Reports\\adactinjson.json",
            		"junit:src\\test\\resources\\Reports\\adactin.xml",
            		"rerun:src\\test\\resources\\Failed\\failedScenarios.txt"
                     })
public class TestRunner {
	@AfterClass
	public static void jvmReportsGeneration() 
	{
        JVMReport.generateJVMRepot(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\adactinjson.json");
	}
	

}
