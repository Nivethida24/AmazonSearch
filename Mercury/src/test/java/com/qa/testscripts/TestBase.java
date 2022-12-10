package com.qa.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.MercuryPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

MercuryPage amaz;
WebDriver driver;


FileInputStream fileLoc;
Properties prop;

@Parameters({"browser","url"})
@BeforeClass
public void setUp(String browser,String url)throws IOException
{

fileLoc=new FileInputStream("C:\\Users\\OVIYA\\OneDrive\\Desktop\\eclipse virtusa\\Mercury\\src\\test\\java\\com\\qa\\testdata\\credentials.properties");
prop=new Properties();
prop.load(fileLoc);


   
if(browser.equalsIgnoreCase("Chrome"))
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}

else if(browser.equalsIgnoreCase("firefox"))
{
WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
}
else if(browser.equalsIgnoreCase("Edge"))
{
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
}
amaz = new MercuryPage(driver);
driver.get(url);
}
//Loc for post conditions
@AfterClass
public void tearDown() throws IOException
{
driver.close();
}
}
