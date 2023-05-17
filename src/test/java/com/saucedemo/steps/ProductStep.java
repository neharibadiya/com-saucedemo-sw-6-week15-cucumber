package com.saucedemo.steps;

import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.Then;

public class ProductStep {
    @Then("^Six products should displayed on page$")
    public void sixProductsShouldDisplayedOnPage() {
        new ProductPage().totalProductOnPage();
    }
}
