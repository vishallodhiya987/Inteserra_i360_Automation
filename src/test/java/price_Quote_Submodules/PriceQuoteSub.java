package price_Quote_Submodules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PriceQuoteSub {
	WebDriver driver; // Declare WebDriver instance
    WebDriverWait wait;
    

	@Test(priority = 0)
	public void setup() throws InterruptedException {

		// Initializing ChromeDriver
		driver = new ChromeDriver();

		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();
        wait= new WebDriverWait(driver,Duration.ofSeconds(30));

	}

	@Test(priority = 1, description = "login with valid credentials scenarios")
	public void loginWithRightCredentials() throws InterruptedException {

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		Thread.sleep(2000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Price Quote ']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Price Quote']"))).click();

		// Click on Base rate module
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"menuTitle\"])[2]"))).click();

		// Click on Add button
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// add base rate name
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"baseRate\"]"))).sendKeys("Automation Test Base Rate");

		// drop down for Rate type

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@ng-reflect-klass=\"c-btn\"]"))).click();
		Thread.sleep(1000);

		//select Automation test base rate
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Base Rate']"))).click();

        //monthly rate
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"monthlyRate\"]"))).sendKeys("10");
        
        //Annual rate
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"annualRate\"]"))).sendKeys("50");
        
        //Sort order
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");

		// click on Save button
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

	}
	
	@Test(priority = 2, description = "Edit Base rate")
	public void EditBaseRate() throws InterruptedException {
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-edit\"])[1]"))).click();
		/*
		 * Thread.sleep(2000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"baseRate\"]"))).clear(
		 * );
		 */
		
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-reflect-name=\"baseRate\"]"))).sendKeys("Automation Test Base Rate (Updated)");
		
		// Update drop down for Rate type
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@ng-reflect-klass=\"c-btn\"]"))).click();
		 * Thread.sleep(1000);
		 * 
		 * //change base rate Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Compliance']"))).click();
		 */
		        //Update monthly rate
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"monthlyRate\"]"))).clear();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"monthlyRate\"]"))).sendKeys("15");
		        
		        //Update Annual rate
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"annualRate\"]"))).clear();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"annualRate\"]"))).sendKeys("100");
		        
		        //Sort order
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).clear();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");

				// click on Save button
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
				
				//delete
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']"))).click();
				
				
				Thread.sleep(3000);
				driver.close();
				

	}
	
	
}