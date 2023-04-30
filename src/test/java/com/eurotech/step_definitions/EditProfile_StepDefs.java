package com.eurotech.step_definitions;

import com.eurotech.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class EditProfile_StepDefs {
    ProfilePage profilePage = new ProfilePage();
    @When("The user select {string} as a career")
    public void the_user_select_as_a_career(String value) {
        profilePage.selectStatus(value);

    }
    @When("The user chose {int} years of work experience")
    public void the_user_chose_years_of_work_experience(Integer expencierYear) {
    profilePage.slader(expencierYear);
    }
    @When("The user add {string} {string}")
    public void the_user_add(String inputBox, String info) {
    profilePage.addInfo(inputBox,info);
    }

    @And("The user clik submit buton")
    public void theUserClikSubmitButon() {
        profilePage.editSubmitBTn.click();
    }
}
