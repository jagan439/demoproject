package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Addtocartpage;
import pages.Demopage;

public class Day3Addtocarttest extends Basemethods {

	@Test
	public void productcostVerify() {

		PageFactory.initElements(Basemethods.driver, Addtocartpage.class);
		WebDriver driver=Basemethods.driver;
		Addtocartpage.mobile.click();
		Addtocartpage.Addtocart.click();
		Addtocartpage.updateqtybox.clear();
		Addtocartpage.updateqtybox.sendKeys("1000");
		Addtocartpage.update.click();
		String msg = "* The maximum quantity allowed for purchase is 500.";
		String text = Addtocartpage.errormsg.getText();
		try {
			Assert.assertEquals(text,msg);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println(msg);
		System.out.println(text);
		Addtocartpage.emptycart.click();
		String emptymsg = Addtocartpage.emptycartmsg.getText();
		String actmsg = "SHOPPING CART IS EMPTY";
		try {
			Assert.assertEquals(actmsg, emptymsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
