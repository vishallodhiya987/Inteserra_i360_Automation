package price_Quote_Submodules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class APP_ACTIVITY   {

	WebDriver driver;
	WebDriverWait wait;
	
	@Test(priority = 0)
	public void setup() throws InterruptedException {

		// Initializing ChromeDriver
		driver = new ChromeDriver();

		
		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	
	}

	@Test(priority = 1, description = "login with valid credentials scenarios")
	public void loginWithRightCredentials() throws InterruptedException {


		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Int@dmin");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		
	}

	
	@Test(priority = 2, description = "Application activity")
	public void applicationactivity() throws InterruptedException {
	
		
		//click on admin
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Admin ']"))).click();
		
		//click on application activity
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Application Activity ']"))).click();
		Thread.sleep(1000);
		//search by username 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"User Name\"]"))).sendKeys("test");
		
		Thread.sleep(1000);
		//click on drop down
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]"))).click();
	
		Thread.sleep(1000);
		//click on an option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Briefing Services']"))).click();
		
		Thread.sleep(4000);
		//click on an option to remove it
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Briefing Services']"))).click();
		
		Thread.sleep(1000);
		//click on an option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Company Directory']"))).click();
		
		Thread.sleep(1000);
		//click on drop down to close it
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@ng-reflect-klass=\"c-btn\"])[2]"))).click();
		
		Thread.sleep(1000);
		//filter by company
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Filter by Company(s)']"))).click();
		
		//select an option
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']"))).click();
		
		//click select action
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Action(s)']"))).click();
				
		//select action 'View'
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='View']"))).click();
		
	
		Thread.sleep(1000);
		//click on download button 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-file-excel-o\"]"))).click();
				
		Thread.sleep(3000);
		driver.close();
		

	}
}