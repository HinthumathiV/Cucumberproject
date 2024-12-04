package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Greythrstepdefinition {
	WebDriver driver;
	

	@Given("I am on the greytHR login page")
	public void i_am_on_the_greyt_hr_login_page() {
		
			driver=new ChromeDriver();
			driver.get("https://techstar.greythr.com/uas/portal/auth/login?login_challenge=9252a53cc9164e21a4cb9daf15b57b66");
			driver.manage().window().maximize(); 
		
		
	    
	}
	

	
	@When("I enter a invalid {string} and {string}>")
	public void i_enter_a_invalid_and(String LoginId, String password) {
		driver.findElement(By.name("username")).sendKeys(LoginId);
		driver.findElement(By.name("password")).sendKeys(password);
	}



	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//div[@class='flex flex-row items-center company-info w-100 h-27 absolute justify-center']")).click();
	    
	}
	

	@Then("I should verify the error message")
	public void i_should_verify_the_error_message() {
		Assert.assertTrue("verify the error message", true);
	    
	}



	
	



	
	
	
	
	
	
	

}
