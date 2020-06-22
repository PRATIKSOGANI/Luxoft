package stepDefinitionsUBS;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UBSstepDefinition extends BaseClass {
	
	//WebDriver driver;
	
	@Given("^User navigates to UBS website$")
	public void user_navigates_to_UBSHomePage() throws InterruptedException {
		
		BaseClass.setup();
		BaseClass.proxypopup();
		
	}
	
	@When("^Title of the page is valid$")
	public void title_of_webpage_is_valid() {
		
		String title = driver.getTitle();
		Assert.assertEquals("UBS financial services around the globe | Global topics",title );
	}

	@Then("^User is on UBS HomePage$")
	public void user_on_HomePage() {
		System.out.println("User is on homePage");
		}
		
	@Given("^User Clicks on Contact button to select Contact Us OPtion$")
	public void user_clicks_ContactUs() {

		String searchText = "Contact us";
		WebElement dropdown = driver.findElement(By.xpath("//span[contains(.,'Contact')]"));
		dropdown.click();
		List<WebElement> options = dropdown.findElements(By.xpath("//li//span//a[@class='catNav__link']"));
		for (WebElement option : options)
		{
		    if (option.getText().equals(searchText))
		    {
		        option.click(); 
		        break;
		    }
		}
		
	}
	
	@When("^Title of the Contact page is valid$")
	public void title_of_contact_page() {
		Assert.assertEquals("Global contacts | UBS Global topics", driver.getTitle());
	}
	
	@Then("^I am on Contact Page$")
	public void On_contact_page() {
		System.out.println("User is on Contact Page");
	}
		
	@Given("^User clicks on UBS Logins and Select US Client Acc Login Option$")
	public void user_clicks_USclientLoginOptions() {
		
		String searchText = "US client account login";
		WebElement dropdown = driver.findElement(By.xpath("//button[@class='headerLogin__toggle js-header-login-open'][contains(.,'UBS logins')]"));
		dropdown.click();
		List<WebElement> options = dropdown.findElements(By.xpath("//li/a"));
		for (WebElement option : options)
		{
		    if (option.getText().equals(searchText))
		    {
		        option.click(); // click the desired option
		        break;
		    }
		}
	}
	
	@When("^Title of the Login page is valid$")
	public void title_of_Login_page() {
		Assert.assertEquals("UBS Online Services", driver.getTitle());
	}
	
	@Then("^I am on Login Page$")
	public void On_Login_page() {
		System.out.println("User is on Login Page");
	}
	
	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_usrnm_pswd(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@Then("^I click on SignIn button$")
	public void click_signin() {
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	}
	
	@Then("^I verify message$")
	public void verify_error() {
		try {
			driver.findElement(By.xpath("//div[@class='notification-content notification-large notification-status-border notification-status-background status-failure icon-is-visible']")).isDisplayed();
			Assert.assertEquals(driver.findElement(By.xpath("//div[@class='notification-text']")).getText(), "Credentials do not match. The credentials you entered did not match. Please try again.");
		}
		
		catch(Exception e) {
			System.out.println("Error message not seen");
		}
		
	}
	
	@And("^I close the browser$")
	public void quit() {
		BaseClass.CloseBrowser();
	}
	
}
