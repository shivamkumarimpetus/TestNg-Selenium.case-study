package TestNg.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependentTests {
	
	
	WebDriver driver ;
	@Test(invocationCount = 10)
	public void LoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivam.kumar\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[1]/div/input")).sendKeys("kumarineelam612@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[2]/div/input")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[4]/button")).click();
		
	}
	
	
	@Test(dependsOnMethods="LoginTest")
	public void HomePageTest()
	{
		boolean c =driver.findElement(By.xpath("/html/body/app-root/app-uhome/div[1]/div[2]/a[5]")).isDisplayed();
		System.out.print(c);
	}

}
