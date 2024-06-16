package com.datadive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

public class LandingPage extends BasePageObject{

    public LandingPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private By searchInputField = By.xpath("//input[@placeholder='Search']");
    private By adminButton = By.xpath("//span[text()='Admin']");
    private By PIMButton = By.xpath("//span[text()='PIM']");
    private By leaveButton = By.xpath("//span[text()='Leave']");
    private By timeButton = By.xpath("//span[text()='Time']");
    private By recruitmentButton = By.xpath("//span[text()='Recruitment']");
    private By myInfoButton = By.xpath("//span[text()='My Info']");
    private By performanceButton = By.xpath("//span[text()='Performance']");
    private By dashboardPageButton = By.xpath("//span[text()='Dashboard']");
    private By directoryButton = By.xpath("//span[text()='Directory']");
    private By maintenanceButton = By.xpath("//span[text()='Maintenance']");
    private By claimButton = By.xpath("//span[text()='Claim']");
    private By buzzButton = By.xpath("//span[text()='Buzz']");

    public void search(String find){
        type(find,searchInputField);
    }


}
