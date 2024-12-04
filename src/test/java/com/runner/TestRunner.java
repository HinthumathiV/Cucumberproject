package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(name ="Successfully login with valid Credentials",stepNotifications = true,dryRun = false,glue ="com.stepdefinition",features= "C:\\Users\\HinthumathiV\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Features\\GreytHRportal.feature")

public class TestRunner{
	
}
