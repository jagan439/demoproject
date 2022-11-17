package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Comparepage {
	
	@FindBy(xpath = "//li[@class='level0 nav-1 first']")
	public static WebElement mobile;
	@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]/div/div/ul/li[2]/a")
	public static WebElement Comparesony;
	@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li[3]/div/div/ul/li[2]/a")
	public static WebElement Compareiphone;
	@FindBy(xpath = "//span[text()='Compare']")
	public static WebElement Comparemobiles;
	@FindBy(xpath = "//*[@title='Close Window']")
	public static WebElement Closewindow;

	
	
	
	
}
