package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    public WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement btnAddCandidate;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement vacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    private WebElement contactNumber;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement resume;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    private WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement dateOfApplication;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    private WebElement notes;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    private WebElement checklistConsent;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    // step action method
    public void setVacancy(){
        vacancy.click();
        vacancy.sendKeys("S");
    }

    public void setResume(){
        resume.sendKeys("C:\\Users\\Lenovo\\Downloads\\soal-jira.txt");
    }

    // step validation method return

}
