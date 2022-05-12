package Com.Vitiger.TestCaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunities_TC01 {

		
		public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		
			
			driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    driver.findElement(By.xpath("//input[@name='accountname']")).click();
		   
		
			TestData td = new TestData();
			String orgname = td.Organisation();
			
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
			driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		    WebElement se = driver.findElement(By.xpath("//input[@name='search_text']"));
		    se.click();
	        se.sendKeys(orgname);
	        

	        WebElement wb11=  driver.findElement(By.id("bas_searchfield"));
	        wb11.click(); 
	        wb.selectValuefromdd(wb11,1);
	        
	        driver.findElement(By.name("submit")).click();
	        Thread.sleep(2000);
	    	String orgname1 = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
			
			System.out.println(orgname1 +"     "+ orgname);
			Thread.sleep(2000);
			if(orgname1.equals(orgname))
			{
				System.out.println("Test Case is Created Successfully, PASS");
			}
			else
			{
				System.out.println("Test Case is Not Created Successfully, FAIL");
			}
	        
	    
	          WebElement move = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	           wb.moveToelement(move);
	           
	           driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		//	driver.quit();
			

		
		
		}
		


	}


