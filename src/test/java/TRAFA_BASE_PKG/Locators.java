package TRAFA_BASE_PKG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {

	// Locators of Log in Page

	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;

	// Locators of TRFA Module

	@FindBy(xpath = "//a[text()='TRFA ']")
	WebElement TRFA;
	@FindBy(xpath = "//div[text()='Carriers']")
	WebElement carriers;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement search_bar;
	@FindBy(xpath = "//a[@class=\"btn btn-success pull-right\"]")
	WebElement add;

	// Locators of Carrier sub module
	@FindBy(xpath = "//input[@formcontrolname=\"carrierName\"]")
	WebElement carrierName;
	@FindBy(xpath = "//input[@formcontrolname=\"sortOrder\"]")
	WebElement sortOrder;
	@FindBy(id = "btnSave")
	WebElement save;
	@FindBy(xpath = "(//i[@class=\"fa fa-edit\"])[1]")
	WebElement edit;
	@FindBy(xpath = "(//a[@title=\"Delete\"])[1]")
	WebElement delete;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yes;

	// Locators of Category module

	@FindBy(xpath = "//div[text()='Categories']")
	WebElement category;
	@FindBy(xpath = "//input[@formcontrolname=\"categoryName\"]")
	WebElement categorybar;

	@FindBy(xpath = "//input[@formcontrolname=\"categorySort\"]")
	WebElement categorysort;

	@FindBy(xpath = "//th[@class=\"gridtableHeader\"]")
	WebElement sortheader;

	// Locators of Content module

	@FindBy(xpath = "//div[text()='Contents']")
	WebElement contents;

	@FindBy(xpath = "//span[text()='Filter by Jurisdiction']")
	WebElement filterbystate;

	@FindBy(xpath = "//label[text()='Alabama']")
	WebElement Alabama;

	@FindBy(xpath = "(//div[@ng-reflect-ng-class=\"[object Object]\"])[6]")
	WebElement filterbyfund;

	@FindBy(xpath = "//label[text()='Annual Inspection and Supervision Fee']")
	WebElement option1;

	@FindBy(xpath = "//span[text()=\"Filter by Category\"]")
	WebElement filterbyCategory;

	@FindBy(xpath = "//label[text()='New Rate']")
	WebElement newrate;

	@FindBy(xpath = "//img[@title=\"Clear\"]")
	WebElement clear;

	// Add Contents form
	@FindBy(xpath = "(//div[@class=\"c-btn\"])[1]")
	WebElement funddropdown;

	@FindBy(xpath = "(//div[@class=\"c-btn\"])[2]")
	WebElement carrierdropdown;

	@FindBy(xpath = "//label[text()='CLEC']")
	WebElement clec;

	@FindBy(xpath = "(//div[@ng-reflect-ng-class=\"[object Object]\"])[11]")
	WebElement categorydropdown;

	@FindBy(xpath = "//input[@ng-reflect-name=\"subcategory\"]")
	WebElement subcategoryfield;

	@FindBy(xpath = "(//input[@ng-reflect-bs-config=\"[object Object]\"])[1]")
	WebElement effectivedate;

	@FindBy(xpath = "(//span[text()='9'])[1]")
	WebElement ninedate;
	
	@FindBy(xpath = "(//input[@ng-reflect-bs-config=\"[object Object]\"])[2]")
	WebElement lastaudit;
	
	
	
	@FindBy(xpath = "//*[@id=\"cke_1_contents\"]/iframe")
	WebElement iframe;
	
	@FindBy(xpath = "//iframe[@title=\"Rich Text Editor, editor3\"]")
	WebElement ruletext;
	
	@FindBy(xpath = "//input[@aria-labelledby=\"cke_142_label\"]")
	WebElement url;
	
	
	@FindBy(xpath = "cke_414_label")
	WebElement ok;
}
