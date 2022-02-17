package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver = null;
	
	@Given("I have opened the browser")
	public void i_have_opened_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:/chrome_webdriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("I am on Google Search page")
	public void i_am_on_google_search_page() {
	    driver.navigate().to("https://www.google.com");
	}
	
	@When("I search for {string}")
	public void i_search_for(String searchString) {
		driver.findElement(By.name("q")).sendKeys(searchString);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("search results should contain {string}")
	public void search_results_should_contain(String string) {
		driver.getPageSource().contains("Wells Fargo");
	}

}
