package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import java.util.List;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;
	    @Given("^I Launch the Opencart Application$")
    public void i_Launch_the_Opencart_Application() throws Throwable {
    	 driver= Base.getDriver();
    	 driver.manage().window().maximize();
    	 System.out.println("Welcome!");
    	 Thread.sleep(3000);
    }

    @Given("^I Click on Create Account link$")
    public void i_Click_on_Create_Account_link() throws Throwable {
        
    	driver.findElement(By.xpath("//a[@title='My Account']")).click();
    	driver.findElement(By.xpath("//a[text()='Register']")).click();
    	Thread.sleep(5000);
    }

    @Then("^I filled the details of the page$")
    public void i_filled_the_details_of_the_page(DataTable data) throws Throwable {
       
    	List<List<String>>  obj=data.raw();
    	DateFormat dateFormat = new SimpleDateFormat("ddmmyyyy");
    	Date date = new Date();
    	String date1= dateFormat.format(date);
    	
    	
    	Date d = new Date(System.currentTimeMillis());
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("f"+date1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("l"+date1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Test"+date1+"@gmail.com");
        Thread.sleep(1000);
        String randomNumbers = RandomStringUtils.randomNumeric(5);
        String phNo = "079393"+randomNumbers;
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(phNo);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(obj.get(0).get(0));
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(obj.get(0).get(0));
        Thread.sleep(3000);
            
    }

    @Then("^I check Privacy policy and Continue$")
    public void i_check_Privacy_policy_and_Continue() throws Throwable {
    	 driver.findElement(By.xpath("//input[@name='agree']")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
    	 Thread.sleep(2000);
    }

    @Then("^I click on Contact Link$")
    public void i_click_on_Contact_Link() throws Throwable {
    	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
   	 Thread.sleep(3000);
    }

    @Then("^I Type the Enquiry$")
    public void i_Type_the_Enquiry() throws Throwable {
    	driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).sendKeys("Testing-ttrrtrtuuyuy");
      	 Thread.sleep(3000);
    }


    @Then("^I Click on Submit button$")
    public void i_Click_on_Continue_button() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='Submit']")).click();
      	 Thread.sleep(3000);
      	driver.findElement(By.xpath("//a[text()='Continue']")).click();
     	 Thread.sleep(3000);
    }

    @Then("^I Click on Samsung Galaxy Phone$")
    public void i_Click_on_Samsung_Galaxy_Phone() throws Throwable {
       
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//img[@alt='iPhone 6'][@class='img-responsive'])[2]")).click();
    	Thread.sleep(3000);
    	WebElement ele = driver.findElement(By.xpath("//a[text()='Samsung Galaxy Tab 10.1']"));
    	ele.isDisplayed();
    	Thread.sleep(2000);
    	
    }

    @Then("^Click on Review tab below$")
    public void click_on_Review_tab_below() throws Throwable {
        
    	driver.findElement(By.xpath("//a[contains(text(),'reviews')]")).click();
    	Thread.sleep(3000);
    	
    }

    @Then("^I fill the details and Click on Continue$")
    public void i_fill_the_details_and_Click_on_Continue(DataTable data) throws Throwable {
      
    	List<List<String>>  obj=data.raw();
    	driver.findElement(By.xpath("//textarea[@id='input-review']")).sendKeys(obj.get(0).get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='4']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[text()='Continue']")).click();
    	Thread.sleep(2000);
    	
        
    }

    @Then("^I Click on Add to Wish List$")
    public void i_Click_on_Add_to_Wish_List() throws Throwable {
    	driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
    	Thread.sleep(2000);
    }

    @Then("^I Close the Success Ribbon message$")
    public void i_Close_the_Success_Ribbon_message() throws Throwable {
    	driver.findElement(By.xpath("//button[@class='close']")).click();
    	Thread.sleep(2000);
    }

    @Then("^I Click on Wishlist link$")
    public void i_Click_on_Wishlist_link() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Wish List')]")).click();
    	Thread.sleep(3000);
    	WebElement ele1 = driver.findElement(By.xpath("//h2[text()='My Wish List']"));
    	ele1.isDisplayed();
    	Thread.sleep(2000);
    }
    
    @Then("^Click on Currency \"([^\"]*)\"$")
    public void Click_on_currency(String currency) throws Throwable {
       System.out.println(currency);
       driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]")).click();
   	Thread.sleep(3000);
       WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'"+currency+"')]"));
   	   ele1.click();
   	   Thread.sleep(3000);
            
    }


    @Then("^Retrive the value and Display$")
    public void retrieve_the_value_and_Display() throws Throwable {
    	
    	WebElement ele2=driver.findElement(By.xpath("//div[@class='price']"));
    	String priceval=ele2.getText();
    	System.out.println(priceval);
       	Thread.sleep(3000);
        
    }


    @Then("^Click on Add to Cart icon$")
    public void click_on_Add_to_Cart_icon() throws Throwable {
    	try
    	{
    	driver.findElement(By.xpath("//button[@data-original-title='Add to Cart']")).click();
    	Thread.sleep(3000);
    	}
    	catch(Exception e)
    	{
    		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
        	Thread.sleep(3000);
    		System.out.println(e);
    	}
    }

    

    @Then("^Click on Remov icon on Product in My Wishlist page$")
    public void click_on_Remov_icon_on_Product_in_My_Wishlist_page() throws Throwable {
    	driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
    	Thread.sleep(3000);

    	
    }
 
   @Then("^I Click on Continue button$")
    public void i_click_on_Continue_button() throws Throwable {
    driver.findElement(By.xpath("//a[text()='Continue']")).click();
	 Thread.sleep(3000);
}

    @Then("^I click on Logout$")
    public void i_click_on_Logout() throws Throwable {
    	driver.findElement(By.xpath("//a[@title='My Account']")).click();
    	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    	Thread.sleep(5000);
    	WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Account Logout']"));
    	ele1.isDisplayed();
    	Thread.sleep(2000);
    }
    @Given("^I Click on Login link$")
    public void i_Click_on_Login_link() throws Throwable {
        
    	driver.findElement(By.xpath("//a[@title='My Account']")).click();
    	driver.findElement(By.xpath("//a[text()='Login']")).click();
    	Thread.sleep(5000);
    }

    @Then("^I filled the details with (.+) and password (.+) and Click on Logon$")
    public void i_filled_the_Email_and_Password_and_Click_on_Logon_Button(String username, String password) throws Throwable {
       
    	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
    	Thread.sleep(5000);
    }

    @Then("^Enter the Keyword in Search box and hit Enter$")
    public void enter_the_Keyword_in_Search_box_and_hit_Enter() throws Throwable {
    	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("ABC");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
    	Thread.sleep(5000);
    	
    }

    @Then("^Select Monitors and Components in the Drop down$")
    public void select_Monitors_and_Components_in_the_Drop_down() throws Throwable {
        driver.findElement(By.xpath("//a[text()='Components']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
    	Thread.sleep(5000);
    }

    @Then("^I Click on Phone and PDA tab$")
    public void i_Click_on_Phone_and_PDA_s_tab() throws Throwable {
    	driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).click();
    	Thread.sleep(5000);
    	WebElement ele = driver.findElement(By.xpath("//h2[text()='Phones & PDAs']"));
    	ele.isDisplayed();
    	
    }

    @Then("^I Sort from price High to Low$")
    public void i_Sort_from_price_High_to_Low() throws Throwable {
        Select sel = new Select(driver.findElement(By.id("input-sort")));
        sel.selectByVisibleText("Price (High > Low)");
        
    }

    @Then("^I Click on Add compare for first three phones$")
    public void i_Click_on_Add_compare_for_first_three_phones_and_click_close() throws Throwable {
        
    	for(int i=1;i<=3;i++)
    	{
    		driver.findElement(By.xpath("(//button[@data-original-title='Compare this Product'])["+i+"]")).click();
    		Thread.sleep(5000);
    	}
    }

    @Then("^I Click on Product Compare$")
    public void i_Click_on_Product_Compare() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Product Compare')]")).click();
    	Thread.sleep(5000);
    }

    @Then("^Click on First Phone link on Page$")
    public void click_on_First_Phone_link_on_Page() throws Throwable {
    	driver.findElement(By.xpath("//strong[text()='Palm Treo Pro']")).click();
    	Thread.sleep(5000);
    }

    @Then("^Check the fifth feature in the description section of phone and write to file$")
    public void check_the_fifth_feature_in_the_description_section_of_phone_and_write_to_file() throws Throwable {
        String text = driver.findElement(By.xpath("//div[@id='tab-description']//li[5]")).getText();
        File DestFile= new File("extractedFilePath");
        FileUtils.writeStringToFile(DestFile, text);
    }

    @Then("^Click on Shopping Cart$")
    public void click_on_Shopping_Cart() throws Throwable {
    	driver.findElement(By.xpath("//button//i[@class='fa fa-shopping-cart']")).click();
    	Thread.sleep(5000);

    }

    @Then("^I Click on Check out$")
    public void i_Click_on_Check_out_Button() throws Throwable {
    	driver.findElement(By.xpath("//p[@class='text-right']//a[contains(@href,'checkout/checkout')]")).click();
    	Thread.sleep(5000);
    }
//Not working in demo.opencart.com
    @Then("^I check the Terms and Conditions checkbox$")
    public void i_check_the_Terms_and_Conditions_checkbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I Click on Browser Back$")
    public void i_Click_on_Browser_Back_Button() throws Throwable {
        driver.navigate().back();
        }

    @Then("^I Click on Order History from My Account$")
    public void i_Click_on_Order_History_from_My_Account() throws Throwable {
    	driver.findElement(By.xpath("//h5[text()='My Account']/..//a[text()='Order History']")).click();
    	Thread.sleep(5000);
    	WebElement ele = driver.findElement(By.xpath("//h1[text()='Order History']"));
    	ele.isDisplayed();
    	Thread.sleep(2000);
    }

    @Then("^Click on Subscribe to News Letter$")
    public void click_on_Subscribe_to_News_Letter() throws Throwable {
    	driver.findElement(By.xpath("//h5[text()='My Account']/..//a[text()='Newsletter']")).click();
    	Thread.sleep(5000);
    	WebElement ele = driver.findElement(By.xpath("//h1[text()='Newsletter Subscription']"));
    	ele.isDisplayed();
    	Thread.sleep(2000);
    }

    @Then("^I click on Extras Specials in Footer$")
    public void i_click_on_Extras_Specials_in_Footer() throws Throwable {
    	driver.findElement(By.xpath("//h5[text()='Extras']/..//a[text()='Specials']")).click();
    	Thread.sleep(5000);
    	WebElement ele = driver.findElement(By.xpath("//h2[text()='Special Offers']"));
    	ele.isDisplayed();
    	Thread.sleep(2000);
    }

    @Then("^Click on List or Grid Whichever is Enabled$")
    public void click_on_List_or_Grid_Whichever_is_Enabled() throws Throwable {
    	driver.findElement(By.xpath("//i[@class='fa fa-th-list']")).click();
    	Thread.sleep(5000);
    }

    
    }
    


