package com.Mentorwise.step_defs;

import com.Mentorwise.pages.HomePage;
import com.Mentorwise.utilities.BrowserUtils;
import com.Mentorwise.utilities.ConfigurationReader;
import com.Mentorwise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpAndDown_stepDefs {

    HomePage homePage = new HomePage();


    @Given("Navigate to the MentorWise website home page")
    public void navigateToTheMentorWiseWebsiteHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @And("the logo should be displayed")
    public void theLogoShouldBeDisplayed() {

        BrowserUtils.waitForVisibility(homePage.logo, 5);
        assertTrue(homePage.logo.isDisplayed());
    }

    @And("the main menu should be visible")
    public void theMainMenuShouldBeVisible() {

        assertTrue(homePage.mainMenu.isDisplayed());
    }


    @When("Click on the {string}")
    public void clickOnLink(String link) {



        switch (link) {
            case "homeLink":
              homePage.homeLink.click();

                break;
            case "aboutMentorWise":
                    try {
                        // Open the website
                        Driver.getDriver().get("https://mentorwise.org.uk");

                        // Wait for the hamburger menu to be visible and click it
                        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
                        Actions actions = new Actions(Driver.getDriver());
                        actions.moveToElement(homePage.aboutMentorWise).click().perform();

                    // Perform any further actions needed
                } finally {
                    break;
                }
            case "joinUs":
                homePage.joinUs.click();
                break;
            case "contactUs":
               homePage.contactUs.click();
                break;
        }

    }

    @Then("Should be redirected to the URL {string}")
    public void assertRedirectedURL(String expectedURL) {
        String currentURL = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL, currentURL);
        Driver.getDriver().navigate().back(); // Navigate back to the home page for the next link
    }



}




