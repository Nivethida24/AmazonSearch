package com.qa.testscripts;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.LearnPage;

//import com.qa.pages.TitlePage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase{
	LearnPage page;
	WebDriver Driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void setUp(String browser,String url)throws IOException, InterruptedException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		}
	/*else if(browser.equalsIgnoreCase("Firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		Driver=new FirefoxDriver();
		}*/
//		else if(browser.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			Driver=new EdgeDriver();
//			  }
		page =new LearnPage(Driver);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.get(url);
//		JavascriptExecutor js=((JavascriptExecutor)Driver);
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		
		}
		@AfterClass
		public void TearDown() throws InterruptedException
		{
			Thread.sleep(5000);
		Driver.close();
}
}