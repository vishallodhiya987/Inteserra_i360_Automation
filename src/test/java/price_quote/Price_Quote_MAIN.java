package price_quote;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Price_Quote_MAIN {

	WebDriver driver;
	
	SetUp_PriceQuote pq = new SetUp_PriceQuote();
	
	
	@Test(priority = 1, description = "set")
	public void SetUp_PriceQuote1() throws InterruptedException
	{
			pq.login_pricequote();
	}
	
	
	
	
	@Test(priority = 2, description = "market entry module", enabled = true)
	public void price_Quote_marketentry1() throws InterruptedException
	{
			pq.price_Quote_marketentry();
	}
	
	
	
	
	@Test(priority = 3, description = "price_Quote_miscfees", enabled = true)
	public void price_Quote_miscfees1() throws InterruptedException
	{
			pq.price_Quote_miscfees();
	}
	
	
	

	@Test(priority = 4, description = "Price Quote Sub", enabled = true)
	public void price_Quote_sub1() throws InterruptedException
	{
		pq.price_Quote_sub();
	}
	
	
	@Test(priority =5, description = "aftersave")
	public void aftersave1() throws InterruptedException
	{
		pq.aftersave();
	}
	
}
	
