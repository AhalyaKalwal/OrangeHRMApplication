package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="RediffApplication",//give the folder name in which the feature file is created
 glue="com.StepDefination", // package name of the Java class in which methods are written
  monochrome=true)  
public class TestRunner {

}
