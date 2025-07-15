package stepdefinitions;
import base.Baseclass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.WaitUtils;
public class LandingPageSteps extends Baseclass {
    @Given("user navigates to the landing page")
    public void user_navigate_to_landing_page(){
        initializebrowser();
    }
    @Then("^user should see (.+) icon$")
    public void user_should_see_icon(String iconText){
     String icon =" //a[normalize-space(text()='" + iconText +"']";
     WebElement iconElement = WaitUtils.waitForElementToBeVisible(Baseclass.driver, By.xpath(icon));
        Assert.assertTrue(iconText + " icon is not visible", iconElement.isDisplayed());

    }
}
