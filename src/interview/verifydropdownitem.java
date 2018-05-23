package interview;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifydropdownitem
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String  str= "Jan";
		
	//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shivaji.d14@gmail.com");
	//	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("8978941135");
	Select dd= new Select(driver.findElement(By.xpath("//*[@id='month']")));
		
   List<WebElement> items = dd.getOptions();
   for(WebElement item: items)
   {
	  System.out.println(item.getText());
	 if(str.equals(item.getText()))
	 {
		 System.out.println("Item available");
	 }
	   }
   }
   


}


