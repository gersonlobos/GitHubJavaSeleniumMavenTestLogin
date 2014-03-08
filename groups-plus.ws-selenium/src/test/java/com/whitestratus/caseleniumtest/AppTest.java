package com.whitestratus.caseleniumtest;


import static org.junit.Assert.assertTrue;

import java.sql.Time;
import java.text.ParseException;

import junit.framework.Assert;



//import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys; // not sure if this


public class AppTest {
	
	
	static WebDriver driver;	
	private static SsJsonHandler jh;
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();

	@BeforeClass
	public static void oneTimeSetUp() throws ParseException {
        // one-time initialization code 
		
		jh = new SsJsonHandler();
		jh.readJsonFile();
    }//end oneTimeSetUp
	
	@Ignore
	//@Before
	public void openBrowser(){
		
		driver = new FirefoxDriver();	
		driver.get(jh.getURL());

		WebElement emailid = driver.findElement(By.id("Email"));
		System.out.println("lol");
		System.out.println(jh.getEMAIL());
		emailid.sendKeys(jh.getEMAIL());
		
		WebElement passw=driver.findElement(By.id("Passwd"));
		passw.sendKeys(jh.getPASSWORD());
		
		WebElement signin=driver.findElement(By.id("signIn"));
		signin.click();
		
	}
	@Ignore
	//@After
	public void closeBrowser(){
		driver.close();
	}
	@Ignore
	//@Test
	public void testApp(){
		assertTrue(true);
	}
	
	@Ignore
	//@Test
	public void testSearch(){
			try{
				driver = new FirefoxDriver();	
				
				driver.get(jh.getURL());
				WebElement emailid = driver.findElement(By.id("Email"));
				System.out.println("lol");
				System.out.println(jh.getEMAIL());
				emailid.sendKeys(jh.getEMAIL());
				
				WebElement passw=driver.findElement(By.id("Passwd"));
				passw.sendKeys(jh.getPASSWORD());
				
				WebElement signin=driver.findElement(By.id("signIn"));
				signin.click();
				
				WebElement element = driver.findElement(By.id("s"));

			        // Enter something to search for
			    element.sendKeys("google");

			    // Now submit the form. WebDriver will find the form for us from the element
			    element.submit();
				
			}catch(Throwable e){ 
				errCollector.addError(e);
			}
	}
	@Test
	public void TestTopRoulete(){
		try{
			driver = new FirefoxDriver();	
			
			driver.get(jh.getURL());

			WebElement emailid = driver.findElement(By.id("Email"));
			System.out.println("lol");
			System.out.println(jh.getEMAIL());
			emailid.sendKeys(jh.getEMAIL());
			
			WebElement passw=driver.findElement(By.id("Passwd"));
			passw.sendKeys(jh.getPASSWORD());
			
			WebElement signin=driver.findElement(By.id("signIn"));
			signin.click();
			
			WebElement element = driver.findElement(By.xpath(".//*[@id='scroller']/div[1]/div/div[1]/div/div[2]/div"));
			element.click();
			element.click();
			element.click();
			element.click();
			element.click();
			element.click();
			
		}catch(Throwable e){ 
			errCollector.addError(e);
		}
		
	}//end TestTopRoulete
	
	
}//end
