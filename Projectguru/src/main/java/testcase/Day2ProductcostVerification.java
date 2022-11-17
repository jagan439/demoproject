package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Demopage;

public class Day2ProductcostVerification extends Basemethods {

	@Test
	public void productcostVerify() {

		PageFactory.initElements(Basemethods.driver, Demopage.class);
		WebDriver driver=Basemethods.driver;
		Demopage.mobile.click();
		String xperiaprice = Demopage.price.getText();
		System.out.println(xperiaprice);
		screenShot("demopageprice");
		Demopage.sony.click();
		String detailspageprice = Demopage.Detailspageprice.getText();
		screenShot("detailspageprice");
		System.out.println(detailspageprice);
		Assert.assertEquals(detailspageprice, xperiaprice);
		
		
		
	}
}
