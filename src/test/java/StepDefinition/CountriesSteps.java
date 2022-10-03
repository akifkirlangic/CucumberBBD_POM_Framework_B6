package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Country")
    public void userCreateCountry() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCountriesPage();
        dialogContentElements.createCountry();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContentElements = new DialogContentElements();

        dialogContentElements.validateSuccessMessage();
    }

    @When("User edit Country")
    public void userEditCountry() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCountriesPage();
        dialogContentElements.editCountry();
    }

    @When("User delete Country")
    public void userDeleteCountry() {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCountriesPage();
        dialogContentElements.deleteCountry();
    }
}
