package com.Mentorwise.pages;

import com.Mentorwise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//img[@class='default_logo'][1]")
    public WebElement logo;

    @FindBy(xpath = "//nav[@id='main-menu']")
    public WebElement mainMenu;



    @FindBy(xpath = "//a[@href='https://mentorwise.org.uk/']//span[@class='item_text' and text()='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//span[@class='item_text' and text()[1]='About Mentor Wise']")
    public WebElement aboutMentorWise;

    @FindBy(xpath = "//span[@class='item_text' and text()='Join Us']")
    public WebElement joinUs;

    //@FindBy(xpath = "//span[@class='item_text' and text()='Branches']")
    //public WebElement branches;

    @FindBy(xpath = "//span[@class='item_text' and text()='Contact Us']")
    public WebElement contactUs;





    // Add more methods for interactions if needed
}
