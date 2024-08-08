package briefing;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Briefing {
	

	private WebDriver driver;
    private WebDriverWait wait;
		
	  @Test(priority = 0) public void beforeTest() {
		  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://staging.inteserra360.com/#/admin/login");
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));}
	  
	  @Test(priority = 1, description = "Log in") public void login() throws
	  InterruptedException {
	  
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).
	  sendKeys("admin");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).
	  sendKeys("Int@dmin");
	  
	  Thread.sleep(3000);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	  "//button[@type='submit']"))).click();
	  
	  }
	 
	@Test(priority = 2, description = "Briefing")
	public void briefing() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Briefings ']"))).click();

	}

	@Test(priority = 3, description = "search briefing", enabled = true)
	public void searchbriefing() throws InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Briefing Services']"))).click();
		Thread.sleep(2000);

		// search
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder=\"Search\"])[1]"))).sendKeys("Ace Infoway Private Limited");

		Thread.sleep(1000);
		// Briefing type filter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Briefing Types']"))).click();

		// select options
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Debit']"))).click();
		Thread.sleep(1000);
		// sub types filter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Briefing Sub Types']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Cramming/Slamming']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Deregulation']"))).click();

		Thread.sleep(1000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Jurisdiction(s)']"))).click();
		Thread.sleep(1000);
		// select states
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='FCC']"))).click();
		// click clear date to remove.
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-eraser\"]"))).click();

		// select category
		//Category is removed now from website
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Category(s)']"))).click();
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commission Notice']"))).click();

	

		// download button
		/*
		 * Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-download\"]"))).click();
		 */
	}



	@Test(priority = 4, description = "Add new briefing", enabled = true)
	public void addnewbriefing() throws InterruptedException, AWTException {
      
		
		// add button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fa fa-plus\"]"))).click();
		
		// select date
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"updateDate\"]"))).click();

		// select 9th date
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='9'])[1]"))).click();

		// select company name
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Company']"))).click();

		// select company
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ace Infoway Pvt. Ltd.']"))).click();

		// select user filter
		/*
		 * Thread.sleep(2000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select User']"))).click();
		 */

		// select all
		/*
		 * Thread.sleep(1000);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Select All'])[1]"))).click();
		 */

		// jurisdiction
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Jurisdiction(s)']"))).click();

		// select FCC
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='FCC']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Monitoring Jurisdiction(s)']"))).click();

		// drop down

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Select All'])[3]"))).click();

		Thread.sleep(1000);
		// Title
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"title\"]"))).sendKeys("Title Test");

		// Description
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[1]/p-editor/div/div[2]/div[1]/p")))
				.sendKeys("Test Description");

		// Executive Summary for Email: *
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[2]/p-editor/div/div[2]/div[1]/p")))
				.sendKeys("Executive Summary for Email");

		// Briefing type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Briefing Types']"))).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Debit']"))).click();

		// Select Briefing Sub Types
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Briefing Sub Types']"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Access']"))).click();

		// Select Category(s) THIS IS REMOVED FROM THE WEBSITE.
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Category(s)']"))).click();
	//	Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Commission Notice']"))).click();

		// Briefing Document upload
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"input-group\"])[1]"))).click();

		// Use Robot class to upload a file
		Thread.sleep(2000);

		String filePath = "C:\\Users\\vishal\\Documents\\TracIt Changes.docx"; // replace with your file
																								// path
		uploadFile(filePath);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"input-group\"])[2]"))).click();

		Thread.sleep(3000);
		uploadFile(filePath);

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}

	public void uploadFile(String filePath) throws AWTException {
		// Set the file path to clipboard
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Create a Robot instance
		Robot robot = new Robot();

		// Press CTRL+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press Enter to upload the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test(priority = 5, description = "Edit Briefing", enabled = true)
	public void editbriefing() throws InterruptedException {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Edit\"])[1]"))).click();

		// update date
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"updateDate\"]"))).click();

		// select 10th date
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='10']"))).click();

		// Update Title

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"title\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"title\"]"))).sendKeys("Title Updated Test");

		// update Description (clear and add neW)
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[1]/p-editor/div/div[2]/div[1]/p")))
				.clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[1]/p-editor/div/div[2]/div[1]/p")))
				.sendKeys("Test Description Updated");

		// Executive Summary for Email: *

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[2]/p-editor/div/div[2]/div[1]/p")))
				.clear();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/app-root/app-admin-layout/body/div/div/section/app-manage-briefing/div/div/form/div/div[2]/div/div/div/div[5]/div[2]/p-editor/div/div[2]/div[1]/p")))
				.sendKeys("Executive Summary for Email Updated");

		// save updates
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
	}

	@Test(priority = 6, description = "Delete", enabled = true)
	public void deletebriefing() throws InterruptedException {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Yes'])[1]"))).click();
	}

	@Test(priority = 7, description = "Add briefing type", enabled = true)
	public void addtype() throws InterruptedException {

		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Briefings ']"))).click();

		// briefing type
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Briefing Types']"))).click();
		Thread.sleep(2000);

		// Search
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Broadband");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Energy");

		// Add Briefing Type

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"carrierCatName\"]"))).sendKeys("Briefing name test");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[2]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		// edit
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//Button[@title=\"Edit\"])[1]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"carrierCatName\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"carrierCatName\"]")))
				.sendKeys("Briefing name test Updated");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[2]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		// Delete
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Yes'])[1]"))).click();

	}

	@Test(priority = 8, description = "Add briefing Sub type", enabled = true)
	public void addsubtype() throws InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Briefings ']"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Briefing Sub Types']"))).click();
		Thread.sleep(2000);

		// Search
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Access");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).clear();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search\"]"))).sendKeys("Electric");

		// Add button
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-success pull-right\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"BulletinSubType\"]")))
				.sendKeys("Briefing Sub Type Test");

		Thread.sleep(2000);

		// short name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"shortName\"]"))).sendKeys("AM");
		Thread.sleep(2000);
		// sort order

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");
		// Toggle
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[2]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		// EDIT Briefing

		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"fa fa-edit\"])[1]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"BulletinSubType\"]"))).clear();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"BulletinSubType\"]")))
				.sendKeys("Briefing Sub Type Test UPDATED");

		Thread.sleep(2000);

		// short name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"shortName\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"shortName\"]"))).sendKeys("QA");
		Thread.sleep(2000);
		// sort order

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname=\"sortOrder\"]"))).sendKeys("0");
		// Toggle
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[1]"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"slider round\"])[2]"))).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();

		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\"Delete\"])[1]"))).click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Yes'])[1]"))).click();

		
		Thread.sleep(3000);
		driver.close();
		
	}
}
