package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	
AmazonPage amazon;
WebDriver driver;
@Parameters({"browser","url"})
@BeforeClass
public void setUp(String browser,String url)throws IOException
{
if(browser.equalsIgnoreCase("Chrome"))
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
else
if(browser.equalsIgnoreCase("Edge"))
{
System.setProperty("webdriver.edge.driver", "C:\\Users\\OVIYA\\OneDrive\\Desktop\\eclipse virtusa\\Amazon\\target\\msedgedriver.exe");
driver = new EdgeDriver();
driver.manage().window().maximize();

}

}
// Loc for post conditions
@AfterClass
public void tearDown() throws IOException
{
driver.close();
}
}

		

