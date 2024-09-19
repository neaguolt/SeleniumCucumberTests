package StepDefinitions;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visibility_registration_heading;

public class RegstrationPage {
    @Then("^User should be able to view the registration page")
    public void see_registration_page(){
        String actualPage = visibility_registration_heading();
        assertEquals("User Registration Page", actualPage);
    }
}
