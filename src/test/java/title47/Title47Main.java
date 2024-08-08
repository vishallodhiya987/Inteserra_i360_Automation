package title47;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Title47Main {
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

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

	}

	@Test(priority = 2, description = "Title 47 Module")
	public void title47() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Title 47 ']"))).click();

	}

	@Test(priority = 3, description = "Title 47 sub module")
	public void title47sub() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"menuTitle\"])[3]"))).click();

		// click on the filter
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Filter by Carrier Type']")))
				.click();

		// select CMRS and Debit from the drop down
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='CMRS']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Debit']"))).click();

		Thread.sleep(2000);
		// Search
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder=\"Search\"])[2]")))
				.sendKeys("Designation");

		// download
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-2x fa-file-excel-o\"]")))
				.click();

		Thread.sleep(2000);
		// Clear button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"Clear\"]"))).click();
	}

	@Test(priority = 4, description = "Add new title 47", enabled = true)
	public void addnewtitle() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-plus\"]"))).click();

		// drop down 1
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Carrier Type']"))).click();

		// select CLEC
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='CLEC']"))).click();

		// drop down 2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]")))
				.click();

		// select 2 options from the drop down
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Maintenance']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Operational']"))).click();

		// click again to close the drop down
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]")))
				.click();

		Thread.sleep(1000); // title
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='title']")))
				.sendKeys("Title Test");

		// LEFT FROM HERE
		WebElement iframe = driver.findElement(By.cssSelector("#cke_1_contents > iframe"));

		Thread.sleep(1000);

		driver.switchTo().frame(iframe);

		// columns //Details
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[normalize-space()=''])[1]")))
				.sendKeys("Details Test");

		driver.switchTo().defaultContent();

		Thread.sleep(8000);

		WebElement iframe2 = driver.findElement(By.cssSelector("#cke_2_contents > iframe"));

		driver.switchTo().frame(iframe2);

		// Pending Activity //
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//body[contains(@class, 'cke_editable')])[1]")))
				.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[normalize-space()=''])[1]")))
				.sendKeys("Pending Activity test");

		driver.switchTo().defaultContent();

		WebElement iframe3 = driver.findElement(By.cssSelector("#cke_3_contents > iframe"));

		driver.switchTo().frame(iframe3);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[normalize-space()=''])[1]")))
				.sendKeys("Internal notes test");

		driver.switchTo().defaultContent();

		WebElement iframe4 = driver.findElement(By.cssSelector("#cke_4_contents > iframe"));

		driver.switchTo().frame(iframe4);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[normalize-space()=''])[1]")))
				.sendKeys("Key Terms test");

		driver.switchTo().defaultContent();

		WebElement iframe5 = driver.findElement(By.cssSelector("#cke_5_contents > iframe"));

		driver.switchTo().frame(iframe5);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[normalize-space()=''])[1]")))
				.sendKeys("Related Forfeitures test");

		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-reflect-name=\"publishdate\"]")).sendKeys("01/01/1995");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-reflect-name=\"cfr\"]")).sendKeys("CFR Testing");
		
		//save
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		//delete
		Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();
		  
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']"))).click();
		 
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
