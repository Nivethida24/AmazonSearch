package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

WebDriver driver;



@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")


 WebElement number;
 public WebElement getNum()
 {
 return number;  
 }
 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")

 WebElement pass;
 public WebElement getPassword()
 {
 return pass;  
 }
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")

 WebElement log;
 public WebElement getLog()
 {
 return log;
 }
 public FlipkartPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}

}

