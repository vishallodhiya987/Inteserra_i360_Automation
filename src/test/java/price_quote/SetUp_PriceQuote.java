package price_quote;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp_PriceQuote extends Locators_PriceQuote {

	WebDriver driver;
	WebDriverWait wait;

	// Constructor

	public SetUp_PriceQuote() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		PageFactory.initElements(driver, this);

	}

	public void login_pricequote() throws InterruptedException {
		driver.get("https://staging.inteserra360.com/#/admin/login");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOf((username))).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Int@dmin");

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(signin)).click();

	}

	public void price_Quote_marketentry() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(pricequote)).click();
		wait.until(ExpectedConditions.elementToBeClickable(marketentry)).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(marketentrytype)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clec)).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(marketentrytype)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ixc)).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(marketentrytype)).click();
		wait.until(ExpectedConditions.elementToBeClickable(voip)).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(marketentrytype)).click();
		wait.until(ExpectedConditions.elementToBeClickable(wireless)).click();

		Thread.sleep(4000);

	}

	public void price_Quote_miscfees() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pricequote)).click();
		wait.until(ExpectedConditions.elementToBeClickable(miscfees)).click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("FCC");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();

		wait.until(ExpectedConditions.elementToBeClickable(title)).sendKeys("Misc Fees Test");

		wait.until(ExpectedConditions.elementToBeClickable(amount)).sendKeys("154");

		wait.until(ExpectedConditions.elementToBeClickable(note)).sendKeys("Notes added Test");

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(cancel)).click();
	}

	public void price_Quote_sub() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pricequote)).click();
		wait.until(ExpectedConditions.elementToBeClickable(pricequotesub)).click();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("Ace Infoway Pvt. Ltd.");
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(isquotedisplay)).click();
		wait.until(ExpectedConditions.elementToBeClickable(yes)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(isquotesent)).click();
		// wait.until(ExpectedConditions.elementToBeClickable(yes)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(isquotestatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(Approved)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ismsa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(Signed)).click();

		// Add Price Quote

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(selectcompany)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ace)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Company Profile Information

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(quotename)).sendKeys("Automation - Test Quote");

		wait.until(ExpectedConditions.elementToBeClickable(exhibitname)).sendKeys("Automation E");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(preparedby)).sendKeys("Automation Script");

		wait.until(ExpectedConditions.elementToBeClickable(filterbyuser)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(user)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Additional Company Questions
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox2)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox3)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox4)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(select)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(selectvoip)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox5)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// State Selection

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(allstatesofmkt)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Notes Page
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(mktall)).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(notesmkt)).sendKeys("Notes Written by Automation Script");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Rate page
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Quote page
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		// Addon page
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(mtrix1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mtrix12)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mtrix13)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mtrix14)).click();

		wait.until(ExpectedConditions.elementToBeClickable(mtrix16)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mtrix17)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mtrix18)).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();

		
		// MISCELLANEOUS FEE Checkboxes
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(c1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c4)).click();

		wait.until(ExpectedConditions.elementToBeClickable(c5)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c6)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c7)).click();
		wait.until(ExpectedConditions.elementToBeClickable(c8)).click();
		
		
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(notesc)).sendKeys("Notes Written by Automation Script");
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();
		
		//Downloads on proposal page
		
		wait.until(ExpectedConditions.elementToBeClickable(download1)).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(download2)).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(download3)).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(download4)).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(download5)).click();
		
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();
		
	}
	
	public void aftersave() throws InterruptedException
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(displaytoggle)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(YesDisplay)).click();
		
		
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(markassent)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(YesSend)).click();
		
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(pending)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dropdownpending)).click();
		wait.until(ExpectedConditions.elementToBeClickable(approved)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(yesapprove)).click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(msa)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(msadropdown)).click();
		wait.until(ExpectedConditions.elementToBeClickable(msasigned)).click();
		wait.until(ExpectedConditions.elementToBeClickable(yesmsasigned)).click();
		
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(downloadonboarding)).click();
		
		//Copy
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(copy)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(yescopy)).click();
		Thread.sleep(2000);
		
		//AfterCopy
		wait.until(ExpectedConditions.elementToBeClickable(pricequote)).click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(pricequotesub)).click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deletecopy)).click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(yesdeletecopy)).click();
		
		
		driver.close();
	}

}
