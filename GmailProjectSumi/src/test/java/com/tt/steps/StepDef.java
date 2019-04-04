package com.tt.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("^I am in Sign In page$")
	
	public void i_am_in_Sign_In_page() throws Throwable {
		
		
	System.setProperty("webdriver.chrome.driver","/Users/sumaiya/Desktop/chromedriver");
	driver = new ChromeDriver();//After import given , when , then 
	 driver.get("https://accounts.google.com");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 
	}

	@When("^I click sign in button in home page$")
	public void i_click_sign_in_button_in_home_page() throws Throwable {
		
	   
	}

	@When("^i enter valid user name$")
	public void i_enter_valid_user_name() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("sumis0991@gmail.com");
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
	   
	}
	

	@When("^i enter valid password$")
	public void i_enter_valid_password() throws Throwable {
	 driver.findElement(By.name("password")).sendKeys("sumiusa2096");
     driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
	}

	@When("^i click Sign in button$")
	public void i_click_Sign_in_button() throws Throwable {
	   
	}

	@Then("^I successfully Sign In$")
	public void i_successfully_Sign_In() throws Throwable {
	  
	}



}
