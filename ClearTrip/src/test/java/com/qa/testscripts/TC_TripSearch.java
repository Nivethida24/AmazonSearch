package com.qa.testscripts;


import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.TripPages;
import com.qa.utility.ExcelUtility;
public class TC_TripSearch extends TestBase{
// WebDriver Driver ;
TripPages Page;
@DataProvider(name="Data")
public String[][] getData() throws IOException {

String xFile="C:\\Users\\OVIYA\\OneDrive\\Desktop\\eclipse virtusa\\ClearTrip\\src\\test\\java\\com\\qa\\testdata\\Trip.xlsx";


String xSheet="Sheet1";

int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);

String[][] data = new String[rowCount][cellCount];

for(int i=1; i<=rowCount; i++) {
for(int j=0;j<cellCount;j++) {
data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
}
}
return data;

}
@Test(dataProvider="Data")
public void Search(String source, String destination) throws InterruptedException
{
Page=new TripPages(Driver);
Thread.sleep(2000);
Page.Close().click();

//Select a=new Select(Page.Travel());
//Thread.sleep(2000);
//a.selectByVisibleText(Source);
//Select b=new Select(Page.Passenger());
//b.selectByVisibleText(Destination);


Page.Source().clear();
Thread.sleep(3000);
Page.Source().sendKeys(source);

Page.Source().sendKeys(source);
Thread.sleep(2000);
Page.Destination().clear();
Page.Destination().sendKeys(destination);
Thread.sleep(2000);
// Driver.navigate().to("https://www.cleartrip.com/flights/results?adults=1&childs=0&infants=0&class=Economy&depart_date=08/12/2022&from=BLR&to=DEL&intl=n&origin=BLR%20-%20Bangalore,%20IN&destination=DEL%20-%20New%20Delhi,%20IN&sd=1670480874675&rnd_one=O&sourceCountry=Bangalore&destinationCountry=New%20Delhi");
// Thread.sleep(2000);
Page.Search().click();
Driver. navigate(). back();

Thread.sleep(5000);



}
}
