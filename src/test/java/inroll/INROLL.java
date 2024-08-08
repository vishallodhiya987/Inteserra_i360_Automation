package inroll;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class INROLL {

	WebDriver driver;
// Create WebDriverWait with 10 seconds timeout
	WebDriverWait wait;

	
	@Test(priority = 0)
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://staging.inteserra360.com/#/admin/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	@Test(priority = 1, description = "Log in")
	public void login() throws InterruptedException {


		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).sendKeys("Int@dmin");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}

	@Test(priority = 2, description = "Inroll Module", enabled = true)
	public void inrollmodule() throws InterruptedException, AWTException {
		// inroll menu
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Inroll ']"))).click();

		// acp claim column mapping module
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='ACP Claim Column Mapping ']")))
				.click();

		// drop down
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@ng-reflect-klass=\"c-btn\"]"))).click();

		// drop down 'Demo' option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='demo']"))).click();

		Thread.sleep(2000);
		// Add button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-primary\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@ng-reflect-klass=\"c-btn\"]"))).click();

		// drop down 'Ace infoway pvt ltd' option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']")))
				.click();

		Thread.sleep(2000);
		// Choose file
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='uploadFile']")))
				.sendKeys("C:\\Users\\vishal\\Downloads\\Applicants (1).csv");

		// Upload button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"Upload\"]"))).click();

		Thread.sleep(5000);

		// select value
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value=\"1\"])[1]"))).click();

		Thread.sleep(2000);

		// select option 1 from the drop down
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()=' Account No. '])[2]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()=' PhoneNumber '])[3]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()=' Email '])[4]"))).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' Is Enrolled Manually '])[5]")).click();

		// save
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\"])[2]")).click();

	}

	@Test(priority = 3, description = "Edit Claim", enabled = true)
	public void editclaim() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Edit\"])[1]"))).click();

		// update selection

		// select option 1 from the drop down
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//option[text()=' Account No. '])[3]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' PhoneNumber '])[2]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' Email '])[5]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' Is Enrolled Manually '])[4]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\"])[2]")).click();

	}

	@Test(priority = 4, description = "Delete Claim", enabled = true)
	public void deleteclaim() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"btn btn-default btn-sm\"])[2]")))
				.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();

	}

	@Test(priority = 5, description = "Lifeline Claim Column Mapping")
	public void lifelineclaim() throws InterruptedException {

		Thread.sleep(2000);
		// click on inroll menu
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Inroll ']"))).click();

		// sub menu lifeline claim column mapping
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Lifeline Claim Column Mapping ']")))
				.click();

		// Add button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-primary\"]"))).click();
		// select drop down element
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Inroll Company']")))
				.click();
		// select options from the drop down
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']")))
				.click();

		// file upload
		driver.findElement(By.xpath("//input[@id='uploadFile']"))
				.sendKeys("C:\\Users\\vishal\\Downloads\\Applicants (1).csv");

		// Upload button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"Upload\"]"))).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("(//option[text()=' Account No. '])[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' PhoneNumber '])[2]")).click();

		Thread.sleep(2000);
		// select value
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()=' Eligiblity Status '])[3]")))
				.click();

		// Save button
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\"])[2]")).click();

		// EDIT Lifeline claim

		// Edit button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Edit\"])[1]"))).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("(//option[text()=' Account No. '])[2]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()=' PhoneNumber '])[1]")).click();

		Thread.sleep(2000);
		// select value
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()=' Eligiblity Status '])[3]")))
				.click();

		// Save button
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\"])[2]")).click();

		// Delete
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"btn btn-default btn-sm\"])[2]")))
				.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();

		
		Thread.sleep(3000);
		driver.close();
		
	}
	
	


}
