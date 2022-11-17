package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Pdfpage;
import pages.Purchasepage;

public class Day7pdftest extends Basemethods {

	public String email = "Acd123@tpg.com.au";
	public String password = "Alan@439";
	
	@Test
	public void pdftest() {
		
		PageFactory.initElements(Basemethods.driver, Pdfpage.class);
		WebDriver driver=Basemethods.driver;
		Purchasepage.myaccount.click();
		Purchasepage.Emailaddress.sendKeys(email);
		Purchasepage.password.sendKeys(password);
		Purchasepage.login.click();
		

		
	}
	
}
