package tracit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tractit {

	WebDriver driver;
    WebDriverWait wait;
    
	@Test(priority = 0)
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://staging.inteserra360.com/#/admin/login");
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

	@Test(priority = 2, description = "Trac it", enabled = true)
	public void tracit() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Trac-It ']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Trac-It Entries']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Inmate");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		// drop down 2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Alabama']"))).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='16']"))).click();

		// drop down 3
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commission Filing']"))).click();

		// drop down 4
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[4]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Debit']"))).click();

		// drop down 1
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Between']"))).click();

	}

	@Test(priority = 3, description = "Add Trac it", enabled = true)
	public void addtrac() throws InterruptedException {

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-primary\"]"))).click();

		// drop down 1 company select
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='TEst one 1 Test LAst name 2']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commission Notice']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[4]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Alabama']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[5]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Debit']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[6]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[7]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Reminders']"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"subject\"]"))).sendKeys("Tract it Subject Test");

		// date
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"MM/DD/YYYY\"]"))).click();
		Thread.sleep(1000);
		// select date
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='23']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"ql-editor ql-blank\"])[1]"))).sendKeys("Charges Notes test");

		// save
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();

		// refresh the list
		Thread.sleep(3000);
		driver.navigate().refresh();

		// edit

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-edit\"])[1]"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"subject\"]"))).sendKeys("UPDATED Tract it Subject Test");

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"ql-editor ql-blank\"])[1]")))
				.sendKeys("UPDATED Charges Notes test");

		// Update button
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']"))).click();

		// delete
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']"))).click();

	}

	@Test(priority = 4, description = "Carrier Types", enabled = false)
	public void carriertypes() throws InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Trac-It ']"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Carrier Types']"))).click();

		/* this is nullified because the carrier type cannot be deleted.
		 * // add Thread.sleep(3000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-primary\"]"))).click();
		 * 
		 * Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"CarrierCatName\"]"))).
		 * sendKeys("Carrier Type Test"); Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select by Product(s)']"))).click()
		 * ; wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='i360']"))).click();
		 * Thread.sleep(1000); // sort order
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"sortOrder\"]"))).
		 * sendKeys("0");
		 * 
		 * // save
		 * 
		 * Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		 */
		// Edit carrier type
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-edit\"])[1]"))).click();

		// Update
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"CarrierCatName\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"CarrierCatName\"]"))).sendKeys("Updated Carrier Type Test");

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']"))).click();
	}

	@Test(priority = 5, description = "Trac it alert", enabled = true)
	public void tracitalert() throws InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Trac-It ']"))).click();
		// Trac it alert

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Trac-It Alerts']"))).click();
		// view
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"View\"])[1]"))).click();

		// view
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"View\"])[1]"))).click();
		
		//Come back to trac it again
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Trac-It ']"))).click();
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}