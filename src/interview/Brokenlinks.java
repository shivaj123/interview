package interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	static WebDriver driver = null;

	public  static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/");
		
		List<WebElement> listlinks = driver.findElements(By.tagName("a"));
		System.out.println("size of listlinks is: "+listlinks.size()); 
	
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for(int i=0;i<listlinks.size();i++)
		{
			if(listlinks.get(i).getAttribute("href")!=null&&(!listlinks.get(i).getAttribute("href").contains("mailto")))
				activelinks.add(listlinks.get(i));
			
			System.out.println(listlinks.get(i).getAttribute("href"));
			
		}
				System.out.println("size of active links is: " +activelinks.size());
			
			for(int j=0;j<activelinks.size();j++)
			{
	HttpURLConnection connection
				= (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
				
				
				connection.connect();
				
				String response = connection.getResponseMessage();
				connection.disconnect();
			
				System.out.println(activelinks.get(j).getAttribute("href")+"  " +response);
			}
		driver.close   ();
		
		



	}

}
