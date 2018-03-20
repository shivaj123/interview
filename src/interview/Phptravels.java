package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {
	

	public  static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		
		String mainwindow= driver.getWindowHandle();
//		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[8]/a/span")).click();
		
		Thread.sleep(2000);
		for(String newtab:driver.getWindowHandles())
		{
			driver.switchTo().window(newtab);
			
		}
		
		driver.findElement(By.xpath("//*[@id='Primary_Navbar-Contact_Us']/a")).click();
		
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div[4]/a")).click();
		
		
		
		
		
		

	}

	

	

}
