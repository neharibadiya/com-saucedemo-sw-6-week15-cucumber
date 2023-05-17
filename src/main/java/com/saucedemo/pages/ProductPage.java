package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> countProduct;


    public String getTextProducts(){
        log.info("Get PRODUCTS text "+ productsText.toString());
        Reporter.log("Get PRODUCTS text "+ productsText.toString());
        return getTextFromElement(productsText);
    }
    public int totalProductOnPage(){
        log.info("Get product "+ countProduct.toString());
        Reporter.log("Get product "+ countProduct.toString());

        List<WebElement> totalElementsOnPage =getListOfElements (countProduct);
        int totalProducts = totalElementsOnPage.size();
        return totalProducts;
    }
}
