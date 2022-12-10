package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitlePage{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement search;
	  public WebElement getGSearch()
	  {
		  return search;	  
	  }
	  @FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
	  WebElement gmail;
	  public WebElement getMail()
	  {
	  return gmail;
	  }
//	  @FindBy(xpath="/html/body/header/div/div/div/a[2]")
//	  WebElement acc;
//	  public WebElement getSignin()
//	  {
//	  return acc;
//	  }
	  @FindBy(xpath="//header/div[1]/div[1]/div[1]/a[3]/span[2]")
	  WebElement creacc;
	  public WebElement getAcc()
	  {
	  return creacc;
	  }
	  @FindBy(xpath="//*[@id=\"firstName\"]")
	  WebElement name;
	  public WebElement getFname()
	  {
	  return name;
	  }
	  @FindBy(xpath="//*[@id=\"lastName\"]")
	  WebElement lname;
	  public WebElement getLname()
	  {
	  return lname;
	  }
	  @FindBy(xpath="//*[@id=\"username\"]")
	  WebElement mail;
	  public WebElement getId()
	  {
	  return mail;
	  }
	  @FindBy(xpath="//*[@id=\"passwd\"]/div[1]/div/div[1]/input")
	  WebElement pwd;
	  public WebElement getpwd()
	  {
	  return pwd;
	  }
	  @FindBy(xpath="//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")
	  WebElement cfm;
	  public WebElement getcfm()
	  {
	  return cfm;
	  }
//	  @FindBy(xpath="//*[@id=\"accountDetailsNext\"]/div/button/div[3]")
//	  WebElement nxt;
//	  public WebElement getnxt()
//	  {
//	  return cfm;
//	  }
//	  
//	  @FindBy(xpath="//*[@id=\"phoneNumberId\"]")
//	  WebElement num;
//	  public WebElement getnum()
//	  {
//	  return cfm;
//	  }
//	  @FindBy(xpath="//*[@id=\"phoneNumberId\"]")
//	  WebElement nxt1;
//	  public WebElement getnxt1()
//	  {
//	  return cfm;
//	  }
	  
	  public TitlePage(WebDriver driver)
	  {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);  
	  }
}