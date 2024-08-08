package crra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRRA_Locators {

	// Locators of Log in Page

		@FindBy(id = "username")
		WebElement username;
		@FindBy(id = "password")
		WebElement password;
		@FindBy(xpath = "//button[text()='Sign In']")
		WebElement signin;
	
    //locators of CRRA module
		
		@FindBy(xpath = "//a[text()='CRRA ']")
		WebElement CRRA;
		@FindBy(xpath = "//div[text()='Contents']")
		WebElement contents;

		@FindBy(xpath = "(//div[@ng-reflect-klass=\"c-btn\"])[1]")
		WebElement filterbystate;

		@FindBy(xpath = "//label[text()='Alabama']")
		WebElement Alabama;
		
		@FindBy(xpath = "//span[text()=\"Filter by Category\"]")
		WebElement filterbyCategory;

		@FindBy(xpath = "//label[text()='Deposit/Advance Payments']")
		WebElement Deposit;
		
		@FindBy(xpath = "//span[text()=\"Filter by SubCategory\"]")
		WebElement filterbysubcategory;
		
		@FindBy(xpath = "//label[text()='Amount']")
		WebElement Amount;

		@FindBy(xpath = "//img[@title=\"Clear\"]")
		WebElement clear;

		
		//Add Contents
		@FindBy(xpath = "//a[@class=\"btn btn-success pull-right\"]")
		WebElement add;
		

		@FindBy(xpath = "//span[text()=\"Select Jurisdiction\"]")
		WebElement SelectJurisdiction;

        @FindBy(xpath ="(//span[text()='Select'])[1]")
        WebElement selectcarrier;
        
        @FindBy(xpath = "//label[text()='ILEC']")
		WebElement ILEC;

        @FindBy(xpath ="(//span[text()='Select'])[1]")
        WebElement selectcategory;
        @FindBy(xpath = "//label[text()='General']")
		WebElement General;
        
        @FindBy(xpath ="(//span[text()='Select'])[1]")
        WebElement auditmonth;
        
        @FindBy(xpath = "//label[text()='January']")
		WebElement January;
        
        
        @FindBy(xpath ="(//span[text()='Select Sub Category'])[1]")
        WebElement subcategory;
        @FindBy(xpath = "//label[text()='Summary']")
		WebElement Summary;
        
                
        @FindBy(css = "#cke_1_contents > iframe")
        WebElement iframe;
        
        @FindBy(xpath ="(//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"])")
        WebElement textbox;
        
        @FindBy(id = "btnSave")
		WebElement save;
        
        @FindBy(xpath ="//input[@formcontrolname=\"effectiveDate\"]")
        WebElement effectivedate;
        
        @FindBy(xpath = "(//span[text()='9'])[1]")
    	WebElement ninedate;
}

