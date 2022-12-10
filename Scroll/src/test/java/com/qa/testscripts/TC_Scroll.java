package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.ScrollPage;
//import com.qa.pages.TitlePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Scroll extends TestBase{
	ScrollPage s; 
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void Search(String browser,String url) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		s=new ScrollPage(driver);
		
		//System.out.println("Page title is : " + Driver.getTitle());
		 //Thread.sleep(3000);
		// driver.navigate().to("https://www.amazon.com/");
		 //Thread.sleep(2000);
		s.getScroll().click();
		s.getScroll().sendKeys(Keys.END);
		 Thread.sleep(2000);
	}
	
		// driver.close();
		 }

