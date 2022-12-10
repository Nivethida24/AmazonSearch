package com.qa.testscripts;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.AmazonPage;
public class TC_AmazonSearch_001 extends TestBase {
AmazonPage amzpages;
@Parameters({"browser","url"})
@Test
public void Search(String browser,String url) throws InterruptedException
{
amzpages=new AmazonPage(Driver);
//ggl drop
amzpages.getGsearch().sendKeys("bluetooth");
List<WebElement> All =amzpages.getGSch();
Thread.sleep(2000);
System.out.println("GGL DROP");
Thread.sleep(3000);
for(WebElement item: All) {
System.out.println(item.getText());
}
Thread.sleep(3000);
Driver.navigate().to("https://www.amazon.com/");
Thread.sleep(2000);
}
//amz drop
@Parameters({"browser","url"})
@Test
public void amzSearch(String browser,String url) throws InterruptedException
{	
amzpages.getSearchBox().sendKeys("redmi");
List<WebElement> AllItems =amzpages.getAllItems();
Thread.sleep(2000);
System.out.println("AMZ DROP");
Thread.sleep(3000);
for(WebElement item: AllItems) {
System.out.println(item.getText());
}
}      
@Parameters({"browser","url"})
@Test
public void signin(String browser,String url) throws InterruptedException
{
	System.out.println("SIGN IN");
amzpages.getEnteraccountlist().click();
Thread.sleep(2000);
amzpages.getCreateAcc().click();
Thread.sleep(5000);
amzpages.getEnterName().sendKeys("Nivethida"+Keys.ENTER);
Thread.sleep(2000);
amzpages.getNum().sendKeys("7810029929");
Thread.sleep(2000);
amzpages.getPwd().sendKeys("123789"+Keys.ENTER);
Thread.sleep(5000);
amzpages.getrePwd().sendKeys("123789"+Keys.ENTER);
Thread.sleep(5000);
System.out.println("SIGNED IN");
}
}
