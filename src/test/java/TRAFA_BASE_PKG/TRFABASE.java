package TRAFA_BASE_PKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TRFABASE extends Locators {

	WebDriver driver;
	WebDriverWait wait;

	// constructor
	public TRFABASE() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	// Method to log in

	public void setup() throws InterruptedException {
		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOf((username))).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Int@dmin");
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();
	
	}

	// Method to search on carrier
	public void trfa_Carriers() {
		wait.until(ExpectedConditions.elementToBeClickable((TRFA))).click();
		wait.until(ExpectedConditions.elementToBeClickable(carriers)).click();
		wait.until(ExpectedConditions.elementToBeClickable(search_bar)).sendKeys("CLEC");

	}

	// Method to Add Carrier

	public void add_carrier() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();
		wait.until(ExpectedConditions.visibilityOf(carrierName)).sendKeys("TestXV");
		wait.until(ExpectedConditions.visibilityOf(sortOrder)).sendKeys("0");
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();
	}

	public void edit_carrier() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(edit)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(carrierName)).sendKeys("TestXV(Updated)");
		wait.until(ExpectedConditions.visibilityOf(sortOrder)).clear();
		wait.until(ExpectedConditions.visibilityOf(sortOrder)).sendKeys("00");
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();
	}

	public void delete_carrier() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(yes)).click();
	}

	// Method for Category
	public void addcategory() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable((TRFA))).click();
		// search
		wait.until(ExpectedConditions.elementToBeClickable(category)).click();
		wait.until(ExpectedConditions.elementToBeClickable(search_bar)).sendKeys("Recovery");
		Thread.sleep(2000);

		// Add
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(categorybar)).sendKeys("Test Category");
		wait.until(ExpectedConditions.visibilityOf(categorysort)).sendKeys("00");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();

		// edit
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sortheader)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(edit)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(categorybar)).sendKeys("Test Category Updated");
		wait.until(ExpectedConditions.visibilityOf(categorysort)).sendKeys("0");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sortheader)).click();

		// delete

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(delete)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(yes)).click();
	}

	public void contents() throws InterruptedException {

		// Search contents
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable((TRFA))).click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(contents)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterbystate)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(Alabama)).click();

		wait.until(ExpectedConditions.elementToBeClickable(filterbyfund)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(option1)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterbyCategory)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(newrate)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(clear)).click();

		// add new content
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(funddropdown)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(option1)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(carrierdropdown)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(clec)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(categorydropdown)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(newrate)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(subcategoryfield)).sendKeys("Sub Category Test");

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(effectivedate)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ninedate)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(lastaudit)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ninedate)).click();

		Thread.sleep(1000);
		driver.switchTo().frame(iframe);

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ruletext)).sendKeys("Rule test Text");

		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(save)).click();
		
		Thread.sleep(3000);
		driver.close();
		


	}

}
