package stepdefinitions;

import base.Baseclass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.WaitUtils;

public class LandingPageSteps extends Baseclass {

    @Given("user navigates to the landing page")
    public void user_navigates_to_landing_page() {
        initializebrowser();  // Just loads URL, doesn’t click anything
    }

    @Then("^user should see the (.+) icon$")
    public void user_should_see_the_icon(String iconText) {
        String xpath = "//a[normalize-space(text())='" + iconText + "']";
        WebElement iconElement = WaitUtils.waitForElementToBeVisible(driver, By.xpath(xpath));

        // Assert visibility only — no interaction
        Assert.assertTrue(iconText + " icon is not visible", iconElement.isDisplayed());

        // Optional: Print result for logging
        System.out.println(" " + iconText + " icon is visible on the landing page.");
    }
}
