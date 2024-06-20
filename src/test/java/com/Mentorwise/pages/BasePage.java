package com.Mentorwise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    //ortak olan pageler icin bu package, webelementleri buraya koyuyoruz.

    // These codes define a Java class named BasePage within the package com.Mentorwise.pages. The BasePage class serves as a base class for other page objects in the application.
    //
    //The class has the following key components:
    //
    //1.
    //Import statements:
    //org.openqa.selenium.WebDriver: This is the interface for interacting with a web browser.
    //org.openqa.selenium.support.PageFactory: This class provides methods for initializing elements in a page object.
    //2.
    //Class declaration:
    //public class BasePage: This declares the BasePage class as public, allowing it to be accessed from other classes.
    //3.
    //Class variables:
    //protected WebDriver driver: This is a protected instance variable that holds a reference to the WebDriver instance. It is declared as protected so that it can be accessed by subclasses.
    //4.
    //Constructor:
    //public BasePage(WebDriver driver): This is the constructor of the BasePage class. It takes a WebDriver instance as a parameter and initializes the driver variable. It also calls PageFactory.initElements(driver, this) to initialize elements in the page object.
    //5.
    //Method:
    //public String getPageTitle(): This method returns the title of the current web page. It uses the getTitle() method of the WebDriver interface to retrieve the title
}
