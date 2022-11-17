package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pdfpage {

	@FindBy(linkText = "MY ACCOUNT")
	public static WebElement myaccount;
	@FindBy(xpath = "//input[@title='Email Address']")
	public static WebElement Emailaddress;
	@FindBy(id = "pass")	
	public static WebElement password;
	@FindBy(xpath ="//button[@title='Login']")
	public static WebElement login;

	
	
}
