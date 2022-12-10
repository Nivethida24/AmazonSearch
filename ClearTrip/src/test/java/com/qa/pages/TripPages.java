package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripPages {
WebDriver Driver;
/*@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div/div/button/div/div/span")
WebElement travel;
public WebElement Travel() {
return travel;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/button/div/div/span")
WebElement passenger;
public WebElement Passenger() {
return passenger;
}*/
@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")
WebElement close;
public WebElement Close() {
return close;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]")
WebElement source;
public WebElement Source() {
return source;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]")
WebElement destination;
public WebElement Destination() {
return destination;
}



@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]")
WebElement search;
public WebElement Search() {
return search;
}

public TripPages(WebDriver Driver) {
this.Driver=Driver;
PageFactory.initElements(Driver, this);
}

}
