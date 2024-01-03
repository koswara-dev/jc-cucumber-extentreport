package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator use Page Factory
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class, 'login-button')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//h6[contains(@class, 'topbar-header')]")
    private WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement btnProfile;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[contains(@class, 'alert-content-text')]")
    private WebElement txtInvalidLogin;

    @FindBy(xpath = "//span[contains(@class, 'input-field-error-message')]")
    private WebElement txtRequired;

    // Step Action
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    // buatkan method logout
    public void logout(){
        btnProfile.click();
        btnLogout.click();
    }

    public void setUsername(String username){
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    // Step Validation
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidLogin(){
        return txtInvalidLogin.getText();
    }

    public String getTxtRequired(){
        return txtRequired.getText();
    }

}
