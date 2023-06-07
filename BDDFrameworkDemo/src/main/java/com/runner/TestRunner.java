package com.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.*;
import org.junit.Test;




@RunWith(Cucumber.class)
@CucumberOptions(
	
	features="src/main/java/com/features",
    glue="com.stepdef",
	plugin="html:target",
	monochrome=true,          //  for readable console
	dryRun = false,           //to compile only feature file make dry run as true otherwise false
	tags = {"@login, @logo"}   //we can use single or multiple tags here like : tags = "@login" 
)


public class TestRunner {

	
}
