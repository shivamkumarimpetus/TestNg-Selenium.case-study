package TestNg.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaseStudyTset {

	
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivam.kumar\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	

	
	
	@Test(priority=1)
	public void registerUser() {
		
		
		driver.get("http://localhost:4200/signup");
		driver.findElement(By.xpath("//input[@aria-label = 'First name']")).sendKeys("dhxcnisdshan");
		driver.findElement(By.xpath("//input[@aria-label = 'Last name']")).sendKeys("musmcvdri");
		driver.findElement(By.xpath("//input[@aria-label='email']")).sendKeys("auh61122@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("110000001");
		driver.findElement(By.xpath("//input[@formcontrolname='cpassword']")).sendKeys("110000001");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
     	jse.executeScript("scrollBy(0,500)");
    	
    	
    	
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
     	driver.findElement(By.xpath("//input[@class='form-check-input me-2']")).click();
     	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	@Test(priority=2)
	public void login() {
		driver.get("http://localhost:4200/login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[1]/div/input")).sendKeys("uh61122@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[2]/div/input")).sendKeys("10000001");
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/div[1]/form/div[4]/button")).click();
		boolean c =driver.findElement(By.xpath("/html/body/app-root/app-uhome/div[1]/div[2]/a[5]")).isDisplayed();
		System.out.print(c);
		
		
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
}
