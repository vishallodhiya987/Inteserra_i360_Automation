package Wireless;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class STATES {
	WebDriver driver; // Declare WebDriver instance

	@SuppressWarnings("deprecation")
	@Test(priority = 0)
	public void setup() throws InterruptedException {

		// Initializing ChromeDriver
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 1, description = "login with valid credentials scenarios")
	public void loginWithRightCredentials() throws InterruptedException {


		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).sendKeys("Int@dmin");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}

	@Test(priority = 2, description = "Wireless Module")
	public void wirelessmod() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='wireless ']")).click();

	}

	@Test(priority = 3, description = "States Module")
	public void States() throws InterruptedException {
		// click on states submodule
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='States']")).click();

		// search new york
		driver.findElement(By.xpath("//input[@class=\"form-control borderLessTextBoxblue\"]")).sendKeys("New York");

		// click on preview button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title=\"Preview\"]")).click();

		// click on Download pdf button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"pdfButton\"]")).click();

		// click on Wireless button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='wireless ']")).click();

		Thread.sleep(3000);
		driver.close();
		
		
	}



}