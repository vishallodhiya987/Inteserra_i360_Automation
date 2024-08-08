package voip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class voip {

	WebDriver driver;
	// Create WebDriverWait with 10 seconds timeout
	WebDriverWait wait;

	
	@Test(priority = 0)
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://staging.inteserra360.com/#/admin/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//span[@class="ng-star-inserted"])[2]
	}

	@Test(priority = 1, description = "Log in")
	public void login() throws InterruptedException {


		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

	}

	@Test(priority = 2, description = "Voip", enabled = true)
	public void voipmod() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='VoIP ']"))).click();

		// click on Sates
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='States']"))).click();

		// Search states
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]")))
				.sendKeys("Utah");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-eye\"])[1]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=\"Download PDF\"]"))).click();

		Thread.sleep(20000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]")))
				.click();

	}

	@Test(priority = 3, description = "Updates sub module", enabled = true)
	public void updates() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='VoIP ']"))).click();

		// click on Sates
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Updates ']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]")))
				.sendKeys("Commission");
		
		Thread.sleep(4000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-plus\"]"))).click();

		// select company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']")))
				.click();

		//
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Duplicate  Ace']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("selectupdateCategory"))).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//option[text()=' State Commission and Legislative Changes ']")))
				.click();

		// select state
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select State Type']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Alabama']"))).click();

		// select regulation
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"c-btn\"])[4]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Regulation']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"updateType\"]")))
				.sendKeys("Update Type Test");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}

	@Test(priority = 4, description = "Edit", enabled = true)
	public void editupdate() throws InterruptedException {
		
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@title=\"Edit\"])[1]"))).click();
		
		Thread.sleep(1000);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"updateType\"]")))
				.clear();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"updateType\"]")))
				.sendKeys("NEW Update Type Test");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Update']"))).click();

	}
	
	@Test(priority =5, description = "Delete")
	public void deleteupdate() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@title=\"Delete\"])[1]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']"))).click();
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}