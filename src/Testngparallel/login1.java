package Testngparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login1 {
	@Test
	public void urllaunch()
	{
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
	}

}
