package org.commonfunctions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basemethods {
	
	public static WebDriver driver;

	@BeforeMethod
	public void startup() {
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() {

		driver.quit();
		
	}
	
	public void select(String text,WebElement element) {
	
		new Select(element).selectByVisibleText(text);
		
	}
	
	public void screenShot(String title) {
	
		File fp = new File("D:\\testing\\space\\Projectguru\\screenshot\\"+title+".png");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		try {
		 FileUtils.copyFile(src, fp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
}
