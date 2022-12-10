package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.MercuryPage;



public class TC_Mercurysearch extends TestBase{
MercuryPage merpages;

@Parameters({"browser","url"})
@Test
public void Search(String browser,String Url) throws InterruptedException
{

merpages=new MercuryPage(driver);


//merpages.getGoogSearchBox().sendKeys("https://demo.guru99.com/test/newtours/"+Keys.ENTER);

merpages.getUserName().sendKeys(prop.getProperty("UserName"));
merpages.getPassword().sendKeys(prop.getProperty("Password"));
Thread.sleep(3000);
merpages.getSearch().click();
Thread.sleep(5000);
}

}
