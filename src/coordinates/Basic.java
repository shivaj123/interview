package coordinates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
   	System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
//		

	}

}
