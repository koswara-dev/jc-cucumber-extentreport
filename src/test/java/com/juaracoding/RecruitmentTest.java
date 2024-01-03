package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RecruitmentTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();
    private static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public RecruitmentTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin login web HRM")
    public void admin_login_web_hrm(){
        loginPage.login("Admin","admin123");
        extentTest.log(LogStatus.PASS,"Admin login web HRM");
    }

    @And("Admin go to menu Recruitment")
    public void admin_go_to_menu_recruitment(){
        recruitmentPage.menuRecruitment.click();
        extentTest.log(LogStatus.PASS,"Admin go to menu Recruitment");
    }

    @When("Admin click button add")
    public void admin_click_button_add(){
        recruitmentPage.btnAddCandidate.click();
        extentTest.log(LogStatus.PASS,"Admin click button add");
    }

    @And("Admin select Vacancy")
    public void admin_select_vacancy(){
        recruitmentPage.setVacancy();
        extentTest.log(LogStatus.PASS,"Admin select Vacancy");
    }

    @And("Admin select document resume")
    public void admin_select_document_resume(){
        recruitmentPage.setResume();
        extentTest.log(LogStatus.PASS,"Admin select document resume");
    }

    // Lengkapi step definition


}
