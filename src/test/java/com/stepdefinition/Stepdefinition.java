package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;

	
 @Given("User is on the greytHR login page")
	public void user_is_on_the_greyt_hr_login_page() {
		driver=new ChromeDriver();
		//driver.get("https://www.greythr.com/login/");
		driver.get("https://techstar.greythr.com/uas/portal/auth/login?login_challenge=27391784e64548cdbf5c6ea8ee0ee20e");
		driver.manage().window().maximize(); 
		
	}
//	@When("User enter a valid {string}")
//	public void user_enter_a_valid(String Email) throws InterruptedException {
//	    driver.findElement(By.name("searchTerm")).sendKeys(Email);
//	    Thread.sleep(2000);
//	}
//	@Then("User click the Captcha")
//	public void user_click_the_captcha() {
//	   driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
//	}
//	@Then("User click the Search button")
//	public void user_click_the_search_button() {
//	    driver.findElement(By.xpath("//span[text()= 'Search']")).click();
//	}
//	@Then("User clicking the Techstar grethr link")
//	public void user_clicking_the_techstar_grethr_link() {
	//    driver.findElement(By.xpath("//span[text()= 'techstar.greythr.com']")).click();
	//}
	@When("User enter a valid {string} and {string}")
	public void user_enter_a_valid_and(String LoginId, String password) {
		driver.findElement(By.name("username")).sendKeys(LoginId);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//div[@class='flex flex-row items-center company-info w-100 h-27 absolute justify-center']")).click();
	}
	
	@Then("User should be redirected to the greytHR dashboard and verify success message after login {string}")
	public void user_should_be_redirected_to_the_greyt_hr_dashboard_and_verify_success_message_after_login(String successmsg) {
		Assert.assertEquals("Hi Hinthumathi", successmsg);
		
	    
	}
}






	
	


