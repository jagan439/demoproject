package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Comparepage;
import pages.Wishlistpage;

public class Day5wishlist extends Basemethods {

	public String firstname = "dalan";
	public String lastname = "dalan07";
	@Test
	public void wishlistShare() throws InterruptedException {

		PageFactory.initElements(Basemethods.driver, Wishlistpage.class);
		WebDriver driver=Basemethods.driver;
		Wishlistpage.myaccount.click();
		Wishlistpage.Createaccount.click();
		Wishlistpage.firstname.sendKeys(firstname);
		//Wishlistpage.middlename.sendKeys("RJ");
		Wishlistpage.lastname.sendKeys(lastname);
		Wishlistpage.email_address.sendKeys("Acd123@tpg.com.au");
		Wishlistpage.password.sendKeys("Alan@439");
		Wishlistpage.confirmpassword.sendKeys("Alan@439");
		Wishlistpage.register.click();
		String actualmsg = Wishlistpage.Welcomemsg.getText();
		String expectedmsg = "Hello, "+firstname+" "+lastname+"!";
		try {
			Assert.assertEquals(actualmsg, expectedmsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		Wishlistpage.Tv.click();
		Wishlistpage.lglcd.click();
		Wishlistpage.sharewishlist.click();
		Wishlistpage.shareemailaddress.sendKeys("jnath439@gmail.com");
		Wishlistpage.sentmsg.sendKeys("Hey jnath!! this LCD TV looks ok, check it out !!.. cheers .. jagan");
		Wishlistpage.sharewishlistmail.click();
		Thread.sleep(3000);
		String expWishList = "Your Wishlist has been shared.";
		String actwishlist = Wishlistpage.wishlistsharedmsg.getText();
		try {
			Assert.assertEquals(actwishlist, expWishList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
	}
}
