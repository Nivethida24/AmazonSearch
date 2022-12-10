package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.TitlePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_TitleSearch extends TestBase{
	TitlePage titpages; 
	WebDriver driver;
	@Parameters({"browser","url"})
	@Test
	public void Search(String browser,String url) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		titpages=new TitlePage(Driver);
		
		//System.out.println("Page title is : " + Driver.getTitle());
		 //Thread.sleep(3000);
		 Driver.navigate().to("https://www.amazon.com/");
		 Thread.sleep(2000);
		 System.out.println("Page title is : " + Driver.getTitle());
		 Driver.navigate().to("https://www.google.com/");
		// Thread.sleep(2000);
	}
	@Parameters({"browser","url"})
	@Test
	public void signin(String browser,String url) throws InterruptedException
	{
	//	 System.out.println("SIGN IN");
		 titpages.getMail().click();
		 Thread.sleep(2000);
		 System.out.println("Page title is : " + Driver.getTitle());
//		titpages.getSignin().click();
//		 Thread.sleep(2000);
		 titpages.getAcc().click();
		 Thread.sleep(2000);
		 titpages.getFname().sendKeys("nivethida");
		 Thread.sleep(2000);
		 titpages.getLname().sendKeys("s");
		 Thread.sleep(2000);
		 titpages.getId().sendKeys("nivi4826");
		 Thread.sleep(2000);
		 titpages.getpwd().sendKeys("Nivi$24Roky"+Keys.ENTER);
		 Thread.sleep(2000);
		 titpages.getcfm().sendKeys("Nivi$24Roky"+Keys.ENTER);
		 Thread.sleep(2000);
//		 titpages.getnxt().click();
//		 Thread.sleep(2000);
//		 titpages.getnum().sendKeys("9442818720");
//		 Thread.sleep(2000);
//		 titpages.getnxt1().click();
//		 Thread.sleep(2000);
		// driver.close();
		 }
}
