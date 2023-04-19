package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("I open the browser and navigate to DevEx web page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        //System.out.println("I enter teacher username and password then click login button");

        loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that the url change to dashboard");
        String actualText = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));
    }


    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        System.out.println("I enter student username and password then click login button");

    }


    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {
        System.out.println("I enter developer username and password then click login button");

    }
    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        System.out.println("I enter SDET username and password then click login button");

    }
}