package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.LearnPage;
//import com.qa.pages.TitlePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Learn extends TestBase{
	LearnPage s; 
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void Search(String browser,String url) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
	s=new LearnPage(Driver); 
		Driver.navigate().to("https://www.simplilearn.com/");
		
		Thread.sleep(2000);
		s.getLogin().click();
		Thread.sleep(2000);
		s.getUname().sendKeys("19p224@kce.ac.in"+Keys.ENTER);
		Thread.sleep(2000);
		s.getPwd().sendKeys("Learn@123"+Keys.ENTER);
		Thread.sleep(2000);
		s.getenter().click();
		Thread.sleep(6000);
		Driver.navigate().to("https://accounts.simplilearn.com/user/profile");
		//driver.close();
	//Thread.sleep(2000);
		 }
}
