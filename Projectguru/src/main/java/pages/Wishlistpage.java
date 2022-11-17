package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistpage {

	@FindBy(linkText = "MY ACCOUNT")
	public static WebElement myaccount;
	@FindBy(xpath = "//a[@title='Create an Account']")
	public static WebElement Createaccount; 
	@FindBy(id = "firstname")	
	public static WebElement firstname;
	@FindBy(id = "middlename")	
	public static WebElement middlename;
	@FindBy(id = "lastname")	
	public static WebElement lastname;
	@FindBy(id = "password")	
	public static WebElement password;
	@FindBy(id = "confirmation")	
	public static WebElement confirmpassword;
	@FindBy(id = "email_address")	
	public static WebElement email_address;
	@FindBy(xpath ="//button[@title='Register']")
	public static WebElement register;
	@FindBy(xpath = "//p[@class='hello']")
	public static WebElement Welcomemsg; 
	@FindBy(xpath = "//a[text()='TV']")
	public static WebElement Tv;
	@FindBy(xpath = "//a[text()='Add to Wishlist']")
	public static WebElement lglcd;
	@FindBy(xpath = "//span[text()='Share Wishlist']")
	public static WebElement sharewishlist;
	@FindBy(id = "email_address")	
	public static WebElement shareemailaddress;
	@FindBy(id = "message")
	public static WebElement sentmsg; 
	@FindBy(xpath = "//button[@title='Share Wishlist']")
	public static WebElement sharewishlistmail;
	@FindBy(xpath = "//li[@class='success-msg']/ul/li/span")
	public static WebElement wishlistsharedmsg;
	
	

		
}
