package com.datadive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

public class WelcomePage extends BasePageObject{

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private String pageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    private By usernameInput = By.xpath("//input[@name='username']");
    private By passwordInput = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[text()=' Login ']");
    private By forgotPasswordText = By.xpath("//p[text()='Forgot your password? ']");
    private By resetPasswordButton = By.xpath("//button[text()=' Reset Password ']");
    private By resetPasswordMessage = By.xpath("//h6[text()='Reset Password link sent successfully']");
    private By loginPageLogo = By.xpath("//div[@class='orangehrm-login-logo']");

    /** Open WelcomePage with it's url */
    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public void logIn(String username, String password){
        log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameInput);
        type(password, passwordInput);
        click(loginButton);
    }

    public void negativeLogIn(String username, String password) {
        log.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameInput);
        type(password, passwordInput);
        click(loginButton);
    }

    public void forgotPasswordFunctionality(String userName){
        log.info("Clicking on Forgot password button");
        click(forgotPasswordText);
        type(userName,usernameInput);
        click(resetPasswordButton);
        log.info("Clicking on Reset password button");
    }

    public String getLoginButtonText(){
        log.info("Get text for login button");
        String actualText = getText(loginButton);
        return actualText;
    }

    public String getForgotPasswordText(){
        log.info("Get text of Forgot password button");
        String actualText = getText(forgotPasswordText);
        return actualText;
    }

    public String getResetPasswordSuccessfullyText(){
        log.info("Get text for resetting password successfully");
        String actualText = getText(resetPasswordMessage);
        return actualText;
    }




}
