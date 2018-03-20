package interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
 
		String username= " ";
		String password= " ";
		System.setProperty("webdriver.chrome.driver","F://chromedriver.exe");
		 WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
	
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		File src= new File("C:/Users/shivaji/workspace1/coordinates/src/testdata/testdata.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheetAt(0);
         int rowcount = ws.getLastRowNum();
         System.out.println(rowcount);
         
		for(int i=2;i<=rowcount;i++)
		{
			//Row r1=ws.getRow(i);
			username=ws.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			password=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
		}
		d.get("https://www.amazon.in/");
		
	d.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]")).click();
		//Thread.sleep(500);
		
	d.findElement(By.xpath("//*[@id='ap_email']")).click();
		d.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='continue']")).click();
		d.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(password);
	
		fis.close();
		wb.close();

	
	}

}
