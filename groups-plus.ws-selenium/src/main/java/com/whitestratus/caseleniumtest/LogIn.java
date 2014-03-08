package com.whitestratus.caseleniumtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {
	static WebDriver driver = new FirefoxDriver();
	String rootURL;
	String testEmailID;
	String testPass;
	
	@Before
	public void setUp(){
		//getter for emailID and pass here
		rootURL = "https://euphoric-oath-481.appspot.com";
		testEmailID = "selenium-2@dev.bg-corporation.com";
		testPass = "5L%qOck9Pu32";
	}
	
	@Test
	public void logIn() {
		driver.get(rootURL);
		
		WebElement emailID = driver.findElement(By.id("Email"));
		emailID.sendKeys(testEmailID);
		
		WebElement pass = driver.findElement(By.id("Passwd"));
		pass.sendKeys(testPass);
		
		WebElement signin = driver.findElement(By.id("signIn"));
		signin.click();
		
		assertTrue(driver.getTitle().startsWith("Cement Australia | Just another WordPress site"));
		
	}
	
//	@Test
//	public void logOut(){
//		WebElement signout = driver.findElement(By.id(id))
//	}
	
	@Test
	public void logInFail(){
		driver.get(rootURL);
		
		WebElement emailID = driver.findElement(By.id("Email"));
		emailID.sendKeys(testEmailID);
		
		WebElement pass = driver.findElement(By.id("Passwd"));
		pass.sendKeys("shouldfail");
		
		WebElement signin = driver.findElement(By.id("signIn"));
		signin.click();
		
		assertTrue(driver.getTitle().startsWith("Sign in - Google Accounts"));
		
		driver.close();
	}

}
