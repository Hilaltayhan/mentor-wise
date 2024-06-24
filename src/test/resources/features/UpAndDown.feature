
Feature: Default

  Scenario: Verify that the home page loads correctly and completely.
    Given Navigate to the MentorWise website home page
    Then the page title should be "Mentor Wise - Non-Profit Dedicated to Support the Youth"
    And the logo should be displayed


  Scenario: Verify home page links
    Given Navigate to the MentorWise website home page
    When Click on the "homeLink"
    Then Should be redirected to the URL "https://mentorwise.org.uk/"
    When Click on the "aboutMentorWise"
    Then Should be redirected to the URL "https://mentorwise.org.uk/about-us/"
    When Click on the "joinUs"
    Then Should be redirected to the URL "https://mentorwise.org.uk/become-a-volunteer/"
    When Click on the "branches"
    Then Should be redirected to the URL "https://mentorwise.org.uk/south-west-london/"
    When Click on the "contactUs"
    Then Should be redirected to the URL "https://mentorwise.org.uk/contact-us/"