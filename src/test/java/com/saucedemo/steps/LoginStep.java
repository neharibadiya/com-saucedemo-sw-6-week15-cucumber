package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStep {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {

    }
    @When("^User enter username \"([^\"]*)\"$")
    public void userEnterUsername(String username)  {
        new LoginPage().enterUserName(username);
        // Write code here that turns the phrase above into concrete actions
    }
    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
        // Write code here that turns the phrase above into concrete actions
    }
    @And("^User click on login button$")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
    }
    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String productsText)  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(productsText,new ProductPage().getTextProducts(),"PRODUCTS message not displayed");
        new ProductPage().getTextProducts();
    }
}
