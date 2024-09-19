package StepDefinitions;

import io.cucumber.java.en.When;

import static pages.SingInPage.*;

public class SignInPage {
    @When("User successfully logs in")
    public void userSuccessfullyLogsIn() {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("User clicks on new Registration button")
    public void userClicksOnNewRegistrationButton() {
        click_newregistration_btn();
    }
}
