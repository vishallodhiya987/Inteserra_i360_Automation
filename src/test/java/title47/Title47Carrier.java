package title47;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Title47Carrier {
	 protected static WebDriver driver; // Declare WebDriver instance


		@Test(priority = 0)
	public void setup() throws InterruptedException {

		// Initializing ChromeDriver
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();

		
	}

	@Test(priority = 1, description = "login with valid credentials scenarios")
	public void loginWithRightCredentials() throws InterruptedException {


		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).sendKeys("Int@dmin");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	
	}

	@Test(priority = 2, description = "Title 47 Module")
	public void title47() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Title 47 ']")).click();

	}

	@Test(priority = 3, description = "Carrier module ")
	public void carrier() throws InterruptedException {
		// click on carrier module
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Carriers']")).click();

		// click on add
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"btn btn-success pull-right\"]")).click();

		// enter carrier name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"carrierName\"]")).sendKeys("Carrier Test");

		// enter sort order
		driver.findElement(By.xpath("//input[@formcontrolname=\"sortOrder\"]")).sendKeys("0");

		// Save button
		driver.findElement(By.id("btnSave")).click();

	
	}

	@Test(priority = 4, description = "Carrier Edit")
	public void editcarrier() throws InterruptedException {
		// Edit button
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-sm\"])[1]")).click();

		// Carrier Clear
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"carrierName\"]")).clear();

		// Carrier Update
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"carrierName\"]")).sendKeys("Carrier Test (Updated");

		// Sort Order clear
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"sortOrder\"]")).clear();

		// sort order update
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"sortOrder\"]")).sendKeys("0");

		// Save button
		driver.findElement(By.id("btnSave")).click();

	}

	
	@Test(priority =5, description = "Delete Action" )
	public void deletecarrier() throws InterruptedException
	{
		// Click on Delete button
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title=\"Delete\"])[1]")).click();

		// click on NO
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
