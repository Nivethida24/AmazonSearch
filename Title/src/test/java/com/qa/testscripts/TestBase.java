package com.qa.testscripts;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.TitlePage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase{
	TitlePage page;
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
		else if(browser.equalsIgnoreCase("Firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		Driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\OVIYA\\OneDrive\\Desktop\\eclipse virtusa\\msedgedriver.exe");
		Driver = new EdgeDriver();
		}
		page =new TitlePage(Driver);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.get(url);
		}
		@AfterClass
		public void TearDown() throws InterruptedException
		{
			Thread.sleep(5000);
		Driver.close();
}
}