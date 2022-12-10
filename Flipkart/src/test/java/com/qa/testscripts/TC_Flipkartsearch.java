package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.FlipkartPage;



public class TC_Flipkartsearch extends TestBase{
	FlipkartPage kart;

@Parameters({"browser","url"})
@Test
public void Search(String browser,String Url) throws InterruptedException
{

kart=new FlipkartPage(driver);


//merpages.getGoogSearchBox().sendKeys("https://demo.guru99.com/test/newtours/"+Keys.ENTER);

kart.getNum().sendKeys(prop.getProperty("Num"));
kart.getPassword().sendKeys(prop.getProperty("Password"));
Thread.sleep(3000);
kart.getLog().click();
Thread.sleep(5000);
}

}
