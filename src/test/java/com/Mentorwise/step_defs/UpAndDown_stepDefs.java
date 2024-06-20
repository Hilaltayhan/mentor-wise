package com.Mentorwise.step_defs;

import com.Mentorwise.pages.HomePage;
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

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpAndDown_stepDefs {

    HomePage homePage = new HomePage();


    @Given("Navigate to the MentorWise website home page.")
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

        assertTrue(homePage.logo.isDisplayed());
    }

    @And("the main menu should be visible")
    public void theMainMenuShouldBeVisible() {

        assertTrue(homePage.mainMenu.isDisplayed());
    }


    @When("Click on the {string}")
    public void clickOnLink(String link) {
        WebElement element = null;

        switch (link) {
            case "homeLink":
              homePage.homeLink.click();
                break;
            case "aboutMentorWise":
               homePage.aboutMentorWise.click();
                break;
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




