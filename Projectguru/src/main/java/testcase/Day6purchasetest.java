package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Purchasepage;

public class Day6purchasetest extends Basemethods {

	public String email = "Acd123@tpg.com.au";
	public String password = "Alan@439";
	
	@Test
	public void purchasetest() throws InterruptedException {

		PageFactory.initElements(Basemethods.driver, Purchasepage.class);
		WebDriver driver=Basemethods.driver;
		Purchasepage.myaccount.click();
		Purchasepage.Emailaddress.sendKeys(email);
		Purchasepage.password.sendKeys(password);
		Purchasepage.login.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Purchasepage.wishlist));
		Purchasepage.wishlist.click();
		Purchasepage.addtocart.click();
	//	Purchasepage.checkout.click();
		select("United States", Purchasepage.country);
		select("New York", Purchasepage.region);
		Purchasepage.postcode.sendKeys("542896");
		Purchasepage.estimatebtn.click();
		Purchasepage.address.sendKeys("ABC");
		Purchasepage.city.sendKeys("New York");
		Purchasepage.telephone.sendKeys("12345678");
		Purchasepage.estimatebtn.click();
		String sFlatRate = "Flat Rate";
	    String flatRate = driver.findElement(By.xpath(".//*[@id='co-shipping-method-form']/dl/dt")).getText();	
	    try {
	    	System.out.println("sFlatRate = "+sFlatRate);
	    	System.out.println("flatRate = "+flatRate);
	    	Assert.assertEquals(sFlatRate, flatRate);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
		
		String rate = Purchasepage.fixedrate.getText();
		String exprate ="$5.00";
		try {
			Assert.assertEquals(rate, exprate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}	
}
