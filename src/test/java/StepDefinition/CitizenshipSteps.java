package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitizenshipSteps {
    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;


    @When("User create Citizenship with {string} name and {string} shortname")
    public void userCreateCitizenshipWithNameAndShortname(String name, String shortName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.createCitizenship(name, shortName);
    }

    @When("User edit {string} citizenship to {string}")
    public void userEditCitizenshipTo(String citizenshipName, String newCitizenshipName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.editCitizenship(citizenshipName,newCitizenshipName);
    }

    @When("User delete {string} citizenship")
    public void userDeleteCitizenship(String citizenshipToDelete) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.deleteCitizenship(citizenshipToDelete);

    }

}
