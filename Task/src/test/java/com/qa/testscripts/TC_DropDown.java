package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.qa.pages.GooglePages;
import com.qa.pages.TaskPage;

//import com.qa.pages.GooglePages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DropDown extends TestBase {
	TaskPage search;
	WebDriver driver;
@Parameters({"browser","url"})
	     @Test
		 public void search(String browser,String url) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	 s=new TaskPage(Driver);
	//driver.get("http://www.google.com");
	s.getSearchBoxfield().sendKeys("Selenium");
	 Thread.sleep(3000);
	List<WebElement> AllItems =s.getAllItems();
	Thread.sleep(2000);
	for(WebElement item: AllItems) {
		System.out.println(item.getText());
		System.out.print("dropdown printed");	
		Thread.sleep(2000);
	}
	Thread.sleep(2000);
	
	//driver.close();
		}

	}
