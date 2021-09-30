package com.example.task_9_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjFactory {
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement accountButton;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    private WebElement userName;

    private WebDriver driver;

    public LoginPageObjFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void login(String email, String password) {
        Wait wait = new Wait(driver);

        wait.click(accountButton);
        wait.sendKeys(emailField, email);
        wait.sendKeys(passwordField, password);
        wait.click(loginButton);

    }

    public WebElement getUserName() {
        return userName;
    }

    public String getUserNameValue() {
        return userName.getText();
    }
}