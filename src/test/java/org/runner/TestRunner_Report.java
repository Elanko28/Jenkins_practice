package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\elank\\Jenkins_Practice\\src\\test\\resources\\FeatureFile\\Login_Basic.feature",
				glue="org.stepdefinition",plugin= {"html:C:\\Users\\elank\\Jenkins_Practice\\AllReports\\html_report",
						"junit:C:\\Users\\elank\\Jenkins_Practice\\AllReports\\juint_report\\fb.xml",
						"json:C:\\Users\\elank\\Jenkins_Practice\\AllReports\\json_report\\facebook.json"})


public class TestRunner_Report {
	
	
	// plugin="pretty"   , monochrome =true
	
		@AfterClass
		public static void aft() {
			JVMReport.generateJVMReport("C:\\Users\\elank\\Jenkins_Practice\\AllReports\\json_report\\facebook.json");

		}
	
	
	

}
