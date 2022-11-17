package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demopage {

	@FindBy(xpath = "//li[@class='level0 nav-1 first']")
	public static WebElement mobile;
	@FindBy(xpath = "//select[@title='Sort By']")
	public static WebElement sortby; 
	@FindBy(xpath = "//span[@id='product-price-1']/child::span")	
	public static WebElement price;
	@FindBy(id = "product-collection-image-1")	
	public static WebElement sony;
	@FindBy(xpath = "//span[@id='product-price-1']/child::span")	
	public static WebElement Detailspageprice;
	@FindBy(xpath = "//a[@title=\"Xperia\"]//following::div//child::div[3]//child::button")
	public static WebElement Addtocart;
	
}
