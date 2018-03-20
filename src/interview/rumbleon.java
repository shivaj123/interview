package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class rumbleon {

	public static void main(String[] args) throws InterruptedException, IOException 

	{
		WebDriver d= null;
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		 d= new ChromeDriver();
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("http://rumbleonqa.tracker.bike/");
	
		
		d.findElement(By.xpath("//*[@id='home']/div[2]/nav/div/ul/ul[1]/li[1]/a")).click();
		d.findElement(By.xpath("//a[text()='CUSTOMER']")).click();
		
		String parentwindow = d.getWindowHandle();
		System.out.println(d.getTitle());
		
		d.findElement(By.xpath("//*[@id='gSignIn_New']/div/div")).click();
		
		/*Set<String> allhandles = d.getWindowHandles();    // get  window id of current window
		while (allhandles.size() < 1)
		{
		    Thread.sleep(500);
		    allhandles = d.getWindowHandles();
		}

		Iterator<String> itererator = allhandles.iterator();   
		String mainWindow = itererator.next();
		String  newwindow = itererator.next();*/
		
		for(String child: d.getWindowHandles())
		{
			d.switchTo().window(child);
		}
		
		
		d.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("shivaji.d14@gmail.com");
		d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		d.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("8985603643");
	
		Actions act =new Actions(d);
		act.sendKeys(Keys.ENTER).build().perform();
		
		 
		
		
		
       d.findElement(By.xpath("//*[@id='home']/div[2]/nav/div/ul/li[2]/a")).click();
        d.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/form/input[1]")).click();
        d.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/form/input[1]")).sendKeys("honda");
        Actions obj =new Actions(d);
		obj.sendKeys(Keys.ENTER).build().perform();
		System.out.println("result is");
		
		
		
  }

}
