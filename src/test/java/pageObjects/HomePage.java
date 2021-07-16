package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	By search=By.xpath("//input[@type='search']");
	
	By productName=By.cssSelector("h4.product-name");
	
	By increment=   By.cssSelector("a.increment");
	
	By addToCart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	By fname=By.xpath("//input[@id='input-firstname']");
	By lname=By.xpath("//input[@id='input-lastname']");
	By email=By.xpath("//input[@id='input-email']");
	By phonenum= By.xpath("//input[@name='telephone']");


	public WebElement getFirstName()
	{
		return driver.findElement(fname);
	}
	public WebElement getLastName()
	{
		return driver.findElement(lname);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getTelephone()
	{
		return driver.findElement(phonenum);
	}
	public WebElement increment()
	{
		return driver.findElement(increment);
	}
	public WebElement addToCart()
	{
		return driver.findElement(addToCart);
	}
	
		
}
