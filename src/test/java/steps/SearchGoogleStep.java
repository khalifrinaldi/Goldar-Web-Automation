package steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchGoogleStep {

    protected WebDriver driver = null;

    @Before
    public void SetupRun(){driver = new ChromeDriver();}

    @Given("^User Open browser and open \"([^\"]*)\"$")
    public void userOpenBrowserAndOpen(String web) throws Throwable {
        driver.get(web);
    }

    @Then("^On Google Homepage type \"([^\"]*)\" and tap search$")
    public void onGoogleHomepageTypeAndTapSearch(String text) throws Throwable {
        driver.findElement(By.id("lst-ib")).sendKeys(text);
        driver.findElement(By.id("_fZl")).click();
    }

    @Then("^On Google Search Element Sign in$")
    public void onGoogleSearchElementSignIn() throws Throwable {
       driver.findElement(By.id("failed")).click();
    }
}
