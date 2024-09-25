package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonpath) {

		File f= new File("C:\\Users\\elank\\Jenkins_Practice\\AllReports\\JVMReport");
		
		Configuration c = new Configuration(f, "FACEBOOK APPLICATION");
		
		c.addClassifications("Windows", "11");
		c.addClassifications("JDK", "1.8");
		c.addClassifications("Tools", "Eclipse photon");
		
		
		List l= new ArrayList();
		l.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

}
