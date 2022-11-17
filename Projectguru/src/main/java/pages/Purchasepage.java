package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchasepage {

	@FindBy(linkText = "MY ACCOUNT")
	public static WebElement myaccount;
	@FindBy(xpath = "//input[@title='Email Address']")
	public static WebElement Emailaddress;
	@FindBy(id = "pass")	
	public static WebElement password;
	@FindBy(xpath ="//button[@title='Login']")
	public static WebElement login;
	@FindBy(xpath ="//div[@class='col-left sidebar col-left-first']/div/div/ul/li/a[@href='http://live.techpanda.org/index.php/wishlist/']")
//	@FindBy(linkText="My Wishlist")
	public static WebElement wishlist;
	@FindBy(xpath ="//span[text()='Add to Cart']")
	public static WebElement addtocart;
	@FindBy(xpath ="//span[text()='Proceed to Checkout']")
	public static WebElement checkout;
	@FindBy(id = "country")	
	public static WebElement country;
	@FindBy(id = "region_id")	
	public static WebElement region;
	@FindBy(id = "postcode")	
	public static WebElement postcode;
	
	@FindBy(xpath ="//button[@title='Estimate']")
	public static WebElement estimatebtn;
	@FindBy(xpath ="//label[@for='s_method_flatrate_flatrate']")
	public static WebElement fixedrate;
	@FindBy(id = "billing:street1")	
	public static WebElement address;
	@FindBy(id = "billing:city")	
	public static WebElement city;
	@FindBy(id = "billing:telephone")	
	public static WebElement telephone;
	
	
	

	
}
