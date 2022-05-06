package Com.Vtiger.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger_Login {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
WebElement	dr	=driver.findElement(By.name("user_name"));
dr.click();
dr.sendKeys("admin");

WebElement	dri	=driver.findElement(By.name("user_password"));
dri.click();
dri.sendKeys("admin");

WebElement	driv =driver.findElement(By.id("submitButton"));
driv.click();

String homepage = driver.getTitle();
System.out.println(homepage);
	}
	
}
