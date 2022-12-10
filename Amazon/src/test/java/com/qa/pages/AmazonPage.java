package com.qa.pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonPage {
WebDriver driver;
//ggl drop
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
WebElement Gsearch;
public WebElement getGsearch()
{
return Gsearch;
}
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")
 List<WebElement> All;//set of web elements
 public List<WebElement> getGSch(){
     return All;
 }
//amz drop
@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
WebElement searchbox;
public WebElement getSearchBox()
{
return searchbox;
}
      @FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]")
 List<WebElement> AllItems;//set of web elements
 
 public List<WebElement> getAllItems(){
     return AllItems;
 }
@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
WebElement acclist;
public WebElement getEnteraccountlist()
{
return acclist;
}
@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
WebElement createac;
public WebElement getCreateAcc()
{
return createac;
}
@FindBy(xpath="//*[@id=\"ap_customer_name\"]")
WebElement entername;
public WebElement getEnterName()
{
return entername;
}
@FindBy(xpath="//*[@id=\"ap_email\"]")
WebElement num;
public WebElement getNum()
{
return num;
}
@FindBy(xpath="//*[@id=\"ap_password\"]")
WebElement Pwd;
public WebElement getPwd()
{
return Pwd;
}
@FindBy(xpath="//*[@id=\"ap_password_check\"]")
WebElement rePwd;
public WebElement getrePwd()
{
return rePwd;
}

public AmazonPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
}