package subscribers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class subscriber {


    WebDriver driver; // Declare WebDriver instance as a class-level variable
	WebDriverWait wait;  
		

	@Test(priority = 0)
		public void setup() throws InterruptedException {
		  
		   // Initializing ChromeDriver
		   driver = new ChromeDriver();
		  
		  
		  
		  driver.get("https://staging.inteserra360.com/#/admin/login");
		  driver.manage().window().maximize();
		  
		  wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	 }
		 
	  
	  @Test(priority = 2, description = "login with valid credentials scenarios")
	  public void loginWithRightCredentials() throws InterruptedException {
	  


			Thread.sleep(5000);

			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

			wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

			Thread.sleep(3000);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		
	  }
	 

	@Test(priority = 3, description = "Subscriber")
	public void subscriber1() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Admin ']"))).click();

		// click on subscriber module Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Subscribers ']"))).click();

		// click on search Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder=\"Search\"])[1]"))).sendKeys("Test");

		// click on filter by prod Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Filter by Product(s)']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='CRRA']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='911']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='i360 Alerts']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='My Files']"))).click();

		// select by company filter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Filter by Company(s)']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='ABC Phone Company (DEMO)']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='ABC Telecom']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='ABc company']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Admire pvt ltd']"))).click();

		// filter
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Filter by Unassign user product(s)']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Users with only free subscriptions']"))).click();

		Thread.sleep(4000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"c-btn\"])[3]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Users with paid subscriptions']"))).click();

		// download Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-download\"]"))).click();

	}

	@Test(priority = 4, description = "Add subscriber")
	public void addsub() throws InterruptedException {

		// add button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		// add username
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"username\"]"))).sendKeys("UserAuto");

		// add password
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@autocomplete=\"new-password\"]"))).sendKeys("123Passwprd");

		// select company filter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"c-btn\"])[1]"))).click();

		// select company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@ng-reflect-klass=\"pure-checkbox\"])[3]"))).click();

		// filter 2 Select Department
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"c-btn\"])[2]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Business Development']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Engineering & Technology']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Information Technology (IT)']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Product Development']"))).click();

		// first name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).sendKeys("TestV");

		// Last name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[4]"))).sendKeys("Test Last Name");

		// email
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[5]"))).sendKeys("TestName@hmail.com");

		// phone
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[6]"))).sendKeys("9874546321");

		// title
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[7]"))).sendKeys("Mr");

		// save
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}

	@Test(priority = 5, description = "Edit Subscriber")
	public void editsubs() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Edit\"])[1]"))).click();

		// update username
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"username\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"username\"]"))).sendKeys("UserAuto (Update)");
		
	

		// update password
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@autocomplete=\"new-password\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@autocomplete=\"new-password\"]"))).sendKeys("1245Passwprd");

		// update first name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[3]"))).sendKeys("TestV");

		// update Last name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[4]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[4]"))).sendKeys("(Updated) Test Last Name");

		//update email
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[5]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[5]"))).sendKeys("Updatedemail@hmail.com");

		//  update phone
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[6]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[6]"))).sendKeys("1121214565");

		//update title
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[7]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"text\"])[7]"))).sendKeys("Mrs");

		// save
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}
	
	@Test(priority = 6, description = "Delete Subscriber")
	public void deletesub() throws InterruptedException
	{
		//delete button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();
		
		//yes
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Yes'])[2]"))).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}