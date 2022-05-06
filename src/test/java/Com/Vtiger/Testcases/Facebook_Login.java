package Com.Vtiger.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {
	@Test
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		WebElement	dr	=driver.findElement(By.name("email"));
//		dr.click();
//		dr.sendKeys("9032210617");
//
//		WebElement	dri	=driver.findElement(By.name("pass"));
//		dri.click();
//		dri.sendKeys("Manoj@");
//
//		WebElement	driv =driver.findElement(By.name("login"));
//		driv.click();

		String homepage = driver.getTitle();
		System.out.println(homepage);
		
		
	}

}
