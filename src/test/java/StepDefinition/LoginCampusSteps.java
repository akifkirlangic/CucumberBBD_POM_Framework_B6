package StepDefinition;

import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCampusSteps {

    LoginPage loginPage;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage();
        loginPage.validateUserOnLoginPage();
    }

    @When("User enter admin credentials")
    public void userEnterAdminCredentials() {
        loginPage = new LoginPage();
        loginPage.userEnterAdminCredentials();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        loginPage = new LoginPage();
        loginPage.validateUserSuccessfullyLoggedIn();
    }
}
