package crra;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRRA_BaseClass extends CRRA_Locators{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CRRA_BaseClass()
	{
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}
	
	public void setup() throws InterruptedException 
	{
		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf((username))).sendKeys("admin");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Int@dmin");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();


}
	
	public void contentssearch() throws InterruptedException
	{
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(CRRA)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(contents)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterbystate)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(Alabama)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterbyCategory)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(Deposit)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterbysubcategory)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(Amount)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(clear)).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();
	}
	
	public void contentadd() throws InterruptedException
	{
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SelectJurisdiction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(Alabama)).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(selectcarrier)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ILEC)).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(selectcategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(General)).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(auditmonth)).click();
		wait.until(ExpectedConditions.elementToBeClickable(January)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(subcategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(Summary)).click();
		
		
		Thread.sleep(1000);
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(textbox)).sendKeys("Text Test");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(effectivedate)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ninedate)).click();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
