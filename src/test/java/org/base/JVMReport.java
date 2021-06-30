package org.base;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
    public static void generateJVMRepot(String jsonpath) 
    {
    	
//    1.Mention the target folder location
    	File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");

//    2.Add details to report ----------Configuration
    	Configuration con=new Configuration(f, "Adaction Web App");
    	con.addClassifications("Platorm name", "Windows 10");
    	con.addClassifications("Browser name", "Chrome");
    	con.addClassifications("Browser version", "89.0");
    	con.addClassifications("Sprint number", " 14");
    	
//    3.String to List<String>
    	List<String> list=new ArrayList<String>();
    	list.add(jsonpath);
    	
//    4.Create object for ReportBuilder Class-----Using which we can generateReports methods
    	ReportBuilder r = new ReportBuilder(list, con);
    	r.generateReports();
    	
    	
	}
}
