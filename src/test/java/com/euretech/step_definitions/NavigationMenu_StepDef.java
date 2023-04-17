package com.euretech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDef {
    /**
     Scenario 1:
     Login as Teacher
     At first get the text of welcome
     Then go to Developers menu and get the text of Developers

     Scenario 2:
     Login as Student
     Get the text of welcome
     Then go to All Posts menu and get the text of Posts

     Scenario 3:
     Login as Teacher
     Get the text of welcome
     Then go to My Account menu and get the text of Dashboard

     -Write scenarios
     -Create step definitions
     -No need to use any JAVA code.
     -Just implement the step definitions by adding print statement.
     -Create new class NavigationMenuStepDefs
     */

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("I verify that welcome message is here");
    }
    @When("The user navigates to developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("I navigate to developers menu");

    }
    @Then("The user should be able to see Developer text")
    public void the_user_should_be_able_to_see_developer_text() {
        System.out.println("I verify that developers menu is here");
    }


    @When("The user navigates to All Posts menu")
    public void the_user_navigates_to_all_posts_menu() {

    }
    @Then("The user should be able to see Posts text")
    public void the_user_should_be_able_to_see_posts_text() {

    }




    @Then("The user should be able to My Account message")
    public void the_user_should_be_able_to_my_account_message() {

    }
    @Then("The user should be able to see Dashboard text")
    public void the_user_should_be_able_to_see_dashboard_text() {

    }

}

