package testcase;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Demopage;

public class Day1Sorttest extends Basemethods {

	
	@Test
	public void sortbyName() {

		PageFactory.initElements(Basemethods.driver, Demopage.class);
		WebDriver driver=Basemethods.driver;
		String text = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(text);
		//Assert.assertEquals("This is demo site for   ", text);
		Demopage.mobile.click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		select("Name", Demopage.sortby);
		screenShot("sort");
		
		
		/*	File fp = new File("D:\\testing\\space\\SeleniumTest\\screenshot.png");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, fp);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
	}

	
	

	
}
