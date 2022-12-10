package com.qa.testscripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.qa.pages.TripPages;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
TripPages Page;
WebDriver Driver;
@Parameters({"Browser","Url"})
@BeforeClass
public void Setup(String Browser,String Url)throws IOException,InterruptedException
{
if(Browser.equalsIgnoreCase("Chrome"))
{
WebDriverManager.chromedriver().setup();
Driver=new ChromeDriver();

}
else if(Browser.equalsIgnoreCase("Edge"))
{
System.setProperty("webdriver.edge.driver","C:\\Users\\OVIYA\\OneDrive\\Desktop\\eclipse virtusa\\ClearTrip\\target\\msedgedriver.exe");

//WebDriverManager.edgedriver().setup();
Driver=new EdgeDriver();

    }
  else if(Browser.equalsIgnoreCase("Firefox"))
       {
WebDriverManager.firefoxdriver().setup();
        Driver=new FirefoxDriver();
        }
Page=new TripPages(Driver);
Driver.manage().window().maximize();
Driver.get(Url);
Thread.sleep(3000);
Page.Close().click();
}
@AfterClass
public void TearDown()throws IOException{
Driver.close();
}


}
