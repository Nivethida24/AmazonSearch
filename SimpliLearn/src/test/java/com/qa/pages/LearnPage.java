package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnPage{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"topHeader\"]/div/nav[2]")
	WebElement login;
	  public WebElement getLogin()
	  {
		  return login;	  
	  }
		@FindBy(xpath="//*[@id=\"login-form\"]/div[2]/input")
		WebElement Uname;
		  public WebElement getUname()
		  {
			  return Uname;	  
		  }
			@FindBy(xpath="//*[@id=\"password\"]")
			WebElement Pwd;
			  public WebElement getPwd()
			  {
				  return Pwd;	  
			  }
				@FindBy(xpath="/html/body/div[8]/div[3]/div[1]/div/div[1]/div/div/div/div[4]/form/div[5]/input")
				
				WebElement enter;
				  public WebElement getenter()
				  {
					  return enter;	  
				  }
	 
	  
	  public LearnPage(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
}


	