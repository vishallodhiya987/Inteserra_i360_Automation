package price_quote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators_PriceQuote {

	// locators for log in

	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;

	// locators for price quote

	@FindBy(xpath = "//a[text()='Price Quote ']")
	WebElement pricequote;

	// market entry sub module

	@FindBy(xpath = "(//div[@class=\"menuTitle\"])[3]")
	WebElement marketentry;

	@FindBy(xpath = "//div[@class=\"c-btn\"]")
	WebElement marketentrytype;

	// Market Entry Types

	@FindBy(xpath = "//label[text()='Market Entry - CLEC']")
	WebElement clec;

	@FindBy(xpath = "//label[text()='Market Entry - IXC']")
	WebElement ixc;

	@FindBy(xpath = "//label[text()='Market Entry - VOIP']")
	WebElement voip;

	@FindBy(xpath = "//label[text()='Market Entry - Wireless']")
	WebElement wireless;

	// Misc fees Menu
	@FindBy(xpath = "(//div[@class=\"menuTitle\"])[4]")
	WebElement miscfees;

	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement search;

	@FindBy(xpath = "//a[@class=\"btn btn-success pull-right\"]")
	WebElement add;

	@FindBy(xpath = "//input[@ng-reflect-name=\"miscellaneousTitle\"]")
	WebElement title;

	@FindBy(xpath = "//input[@ng-reflect-name=\"miscellaneousAmount\"]")
	WebElement amount;

	@FindBy(xpath = "//input[@ng-reflect-name=\"miscellaneousNote\"]")
	WebElement note;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	@FindBy(id = "btnCancel")
	WebElement cancel;

	// pricequote sub

	@FindBy(xpath = "(//div[@class=\"menuTitle\"])[6]")
	WebElement pricequotesub;

	// drop downs

	@FindBy(xpath = "//span[text()='Please Select Display Quote']")
	WebElement isquotedisplay;

	// can be used for other dropdowns too

	@FindBy(xpath = "(//label[text()='Yes'])[1]")
	WebElement yes;

	@FindBy(xpath = "//span[text()='Please Select Is Quote Sent']")
	WebElement isquotesent;

	@FindBy(xpath = "//span[text()='Please Select Quote Status']")
	WebElement isquotestatus;

	@FindBy(xpath = "//label[text()='Approved']")
	WebElement Approved;

	@FindBy(xpath = "//span[text()='Please Select MSA Status']")
	WebElement ismsa;

	@FindBy(xpath = "//label[text()='Signed']")
	WebElement Signed;

	@FindBy(xpath = "//span[text()='Select Company']")
	WebElement selectcompany;

	@FindBy(xpath = "//label[text()='Ace Infoway Pvt. Ltd.']")
	WebElement ace;

	@FindBy(id = "btnNext")
	WebElement next;

	@FindBy(xpath = "//input[@ng-reflect-name=\"quoteName\"]")
	WebElement quotename;

	@FindBy(xpath = "//input[@ng-reflect-name=\"exhibit\"]")
	WebElement exhibitname;

	@FindBy(xpath = "//input[@ng-reflect-name=\"quotePreparedBy\"]")
	WebElement preparedby;

	@FindBy(xpath = "//span[text()='Filter by user']")
	WebElement filterbyuser;

	@FindBy(xpath = "//label[text()='Agrim Aflora']")
	WebElement user;
	
	//
	//Check boxes
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"productcheckbox_5\"]")
	WebElement checkbox1;
	
	
			@FindBy(xpath = "//input[@ng-reflect-name=\"productcheckbox_63\"]")
	WebElement checkbox2;
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"productcheckbox_62\"]")
	WebElement checkbox3;
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"productcheckbox_6\"]")
	WebElement checkbox4;
	
	
	
	@FindBy(xpath = "//span[text()='Select']")
	WebElement select;
	@FindBy(xpath = "//label[text()='Market Entry - VOIP']")
	WebElement selectvoip;
	
	
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"productcheckbox_61\"]")
	WebElement checkbox5;
	

	@FindBy(xpath = "//input[@ng-reflect-name=\"baserate_6\"]")
	WebElement allstatesofmkt;
	
	@FindBy(xpath = "//input[@name=\"selectedState_soS_Service_Fees\"]")
	WebElement mktall;
	
	@FindBy(xpath = "//textarea[@name=\"notes\"]")
	WebElement notesmkt;
	
	//Add on page 
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_43\"]")
	WebElement mtrix1;
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_44\"]")
	WebElement mtrix12;
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_51\"]")
	WebElement mtrix13;
	
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_70\"]")
	WebElement mtrix14;
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_71\"]")
	WebElement mtrix16;
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_72\"]")
	WebElement mtrix17;
	@FindBy(xpath = "//input[@ng-reflect-name=\"selectedBaseRate_73\"]")
	WebElement mtrix18;
	
	
	//Compliance Page
	//MISCELLANEOUS FEE check boxes
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	WebElement c1;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
	WebElement c2;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[3]")
	WebElement c3;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[4]")
	WebElement c4;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[5]")
	WebElement c5;
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[6]")
	WebElement c6;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[7]")
	WebElement c7;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[8]")
	WebElement c8;
	
	
	@FindBy(xpath = "//textarea[@class=\"ng-pristine ng-valid ng-touched\"]")
	WebElement notesc;
	
	//Proposal page
	
	@FindBy(xpath = "(//i[@class=\"fa fa-download\"])[1]")
	WebElement download1;
	@FindBy(xpath = "(//i[@class=\"fa fa-download\"])[2]")
	WebElement download2;
	@FindBy(xpath = "(//i[@class=\"fa fa-download\"])[3]")
	WebElement download3;
	@FindBy(xpath = "(//i[@class=\"fa fa-download\"])[4]")
	WebElement download4;
	@FindBy(xpath = "(//i[@class=\"fa fa-download\"])[5]")
	WebElement download5;
	
	
	//after the quote is made
	
	@FindBy(xpath ="(//span[@title=\"Click to mark as Display\"])[1]")
	WebElement displaytoggle;
	
	
	@FindBy(xpath ="(//button[text()='Yes'])[3]")
	WebElement YesDisplay;
	
	
	@FindBy(xpath ="(//span[@title=\"Click to mark as Sent\"])[1]")
	WebElement markassent;
	
	@FindBy(xpath ="(//button[text()='Yes'])[2]")
	WebElement YesSend;
	
	@FindBy(xpath="(//a[text()='Pending'])[1]")
	WebElement pending;
	
	@FindBy(xpath="//*[@id=\"approveConfirmationModal\"]/div/div/div[2]/div[1]/div/angular2-multiselect/div/div[1]/div")
	WebElement dropdownpending;

	
	@FindBy(xpath ="//*[@id=\"approveConfirmationModal\"]/div/div/div[2]/div[1]/div/angular2-multiselect/div/div[2]/div[3]/div/ul/li[2]/label")
	WebElement approved;
	
	@FindBy(xpath ="(//button[text()='Yes'])[4]")
	WebElement yesapprove;
	
	@FindBy(xpath= "(//a[@title=\"Click to change MSA status\"])[1]")
	WebElement msa;
	
	@FindBy(xpath = "(//span[text()='Please Select MSA Status'])[2]")
	WebElement msadropdown;
	
	@FindBy(xpath ="(//label[text()='Signed'])[2]")
	WebElement msasigned;
	
	@FindBy(xpath ="(//button[text()='Yes'])[5]")
	WebElement yesmsasigned;
	
	@FindBy(xpath ="(//a[@title=\"Export Onboarding\"])[1]")
	WebElement downloadonboarding;
	
	@FindBy(xpath ="/html/body/app-root/app-admin-layout/body/div/div/section/app-pricing-quotes/div[1]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[13]/a[3]/i")
	WebElement copy;
	
	@FindBy(xpath ="//*[@id=\"duplicateModel\"]/div/div/div[3]/div/button[1]")
	WebElement yescopy;
	
	@FindBy(xpath="/html/body/app-root/app-admin-layout/body/div/div/section/app-pricing-quotes/div[1]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[13]/a[2]/i")
	WebElement deletecopy;
	
	@FindBy(xpath = "//*[@id=\"deleteModel\"]/div/div/div[3]/div/button[1]")
	WebElement yesdeletecopy;
	
}
