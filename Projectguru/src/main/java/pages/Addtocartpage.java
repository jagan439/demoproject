package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage {

	@FindBy(xpath = "//li[@class='level0 nav-1 first']")
	public static WebElement mobile;
	@FindBy(xpath = "//a[@title=\"Xperia\"]//following::div//child::div[3]//child::button")
	public static WebElement Addtocart;
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody/tr/td[4]/input")	
	public static WebElement updateqtybox;
	@FindBy(xpath = "//button[@title='Update']")
	public static WebElement update;
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody/tr/td[2]/p")
	public static WebElement errormsg;
	@FindBy(xpath = "//button[@value='empty_cart']")
	public static WebElement emptycart;
	@FindBy(xpath = "//div[@class='page-title']/h1")
	public static WebElement emptycartmsg;
	
	
	
}
