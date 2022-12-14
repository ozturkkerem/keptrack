package com.keptrak.step_definitions;

import com.keptrak.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinition {

    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String title= Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Google");
    }
}
