package ipr_rmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class IPR {

	WebDriver driver;
    WebDriverWait wait;

	@Test(priority = 0)
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://staging.inteserra360.com/#/admin/");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@Test(priority = 1, description = "Log in")
	public void login() throws InterruptedException {

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		
	}

	@Test(priority = 2, description = "IPR", enabled = true)
	public void ipr() throws InterruptedException {

		// click on IPR menu
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='iPR ']"))).click();

		// click on submenu Update
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Updates ']"))).click();

		// search clear new search

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("GOIP GLOBALNET SOLUTIONS LLC");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("ExteNet Systems, LLC");

		Thread.sleep(3000);
		// 3 buttons at the top
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"btn btn-success pull-right\"])[3]"))).click();

		Thread.sleep(4000);
		// back button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		Thread.sleep(2000);
		// hystory imports
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"btn btn-success pull-right\"])[2]"))).click();

		Thread.sleep(4000);
		// back button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		Thread.sleep(2000);
		// import update
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"btn btn-success pull-right\"])[1]"))).click();

		Thread.sleep(4000);
		// back button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// edit button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-edit\"])[1]"))).click();

		// edit
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"previousName\"]"))).clear();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"previousName\"]"))).sendKeys("None");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		// click on IPR menu

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='iPR ']"))).click();

		// Click on Alerts
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-envelope fa-4x\"]"))).click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='iPR ']"))).click();

	}

	@Test(priority = 3, description = "RMD Module Alert")
	public void rmdalrt() throws InterruptedException {
		// RMD Module
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='RMD ']"))).click();

		// Alerts
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='RMD Alerts']"))).click();

		// Search
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("PBXROOT");

		// View
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"View\"])[1]"))).click();

		// view inside
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"View\"])[1]"))).click();

		// Cancel button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cancel']"))).click();

	}

	@Test(priority = 4, description = "RMD Updates")
	public void rmdupdt() throws InterruptedException {
		// RMD Menu
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='RMD ']"))).click();

		// Updates
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Updates ']"))).click();

		// Search
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Samespace Limited");
		// clear search
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		// Link
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@data-toggle=\"modal\"])[1]"))).click();

		// close button in the pop up
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Close'])[1]"))).click();

		// History
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// back button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// RMD Menu
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='RMD ']"))).click();
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
