package Wireless;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Updates {
	WebDriver driver; // Declare WebDriver instance
 
	WebDriverWait wait;
	

	@Test(priority = 0)
	public void setup() throws InterruptedException {

		// Initializing ChromeDriver
		driver = new ChromeDriver();



		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@Test(priority = 1, description = "login with valid credentials scenarios")
	public void loginWithRightCredentials() throws InterruptedException {


		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

			}

	@Test(priority = 2, description = "Wireless Module")
	public void wirelessmod() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='wireless ']"))).click();

	}

	@Test(priority = 3, description = "Updates Module Search")
	public void updates() throws InterruptedException {
		// click on updates module
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"menuTitle\"])[2]"))).click();

		// search by Update category
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Commission");

		// Clear search bar
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		// search by state

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Wyoming");

		// Clear search bar
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		// search by Update type

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Other Requirement");

		// Clear search bar 
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		Thread.sleep(2000); // refresh the page 
		driver.navigate().refresh();
		Thread.sleep(4000);

		// click on Action item checkbox

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@ng-reflect-ng-class=\"checkmark\"]"))).click();

	}

	@Test(priority = 4, description = "Updates Module Search")
	public void Add() throws InterruptedException {

		// Add button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// Drop downs 1

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class=\"pure-checkbox\"])[1]"))).click();

		// dropdown 2
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Duplicate  Ace'])[1]"))).click();

		// dropdown 3

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[3]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Alaska']"))).click();

		// dropdown 4
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[4]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='E-911 Emergency System Surcharge']"))).click();

		// dropdown Update Category
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@ng-reflect-name=\"updateCategoryId\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@ng-reflect-value=\"1\"])[1]"))).click();

		// Update type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).sendKeys("Update type test");

		// selectfundField
		wait.until(ExpectedConditions.elementToBeClickable(By.id("selectfundField"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' Applicable ']"))).click();

		// Save button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}

	@Test(priority = 5, description = "Edit Updates Module Search")
	public void edit() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"btn btn-default btn-sm\"])[1]"))).click();

		// Drop downs 1

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Inteserra']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]"))).click();

		// Update type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).sendKeys("Update type test (Updated)");

		// Save button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		// delete
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@title=\"Delete\"])[1]"))).click();
		// NO
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type=\"button\"])[1]"))).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
