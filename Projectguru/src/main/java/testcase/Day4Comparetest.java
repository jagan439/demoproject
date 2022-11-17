package testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Comparepage;

public class Day4Comparetest extends Basemethods {

	
	@Test
	public void productcomparing() throws InterruptedException {

		PageFactory.initElements(Basemethods.driver, Comparepage.class);
		WebDriver driver=Basemethods.driver;
		Comparepage.mobile.click();
		Comparepage.Comparesony.click();
		Comparepage.Compareiphone.click();
		Comparepage.Comparemobiles.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		screenShot("popup");
		Comparepage.Closewindow.click();

		
	}
	
	
}
