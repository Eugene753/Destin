package com.datadive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.testng.Assert;

import java.util.List;

public class BasePageObject {
    protected WebDriver driver;
    protected Logger log;

    public BasePageObject(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }
    /** Open page with given URL */
    protected void openUrl(String url) {
        driver.get(url);
    }

    /** Find element using given locator */
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    /** Find all elements using given locator */
    protected List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    /** Click on element with given locator when its visible */
    protected void click(By locator) {
        find(locator).click();
    }

    /** Type given text into element with given locator */
    protected void type(String text, By locator) {
        find(locator).sendKeys(text);
    }

    public String getText(By locator){
        // Find the element using the provided locator
        WebElement element = driver.findElement(locator);
        // Return the text of the element
        return element.getText();
    }

    // pass expected text and locator
    // command will get text actual text from the locator
    public void assertText(String expectedText, By locator) {
        String actualText = getText(locator);
        // Assert that the text is as expected
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
    }





}
