package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.And;

public class FeesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @And("User create Fees {string} and {string} and {string} and {string}")
    public void userCreateFeesAndAndAnd(String name, String code, String intCode, String priority) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.createFee(name, code, intCode, priority);

    }

    @And("User edit Fee {string} and change it to {string}")
    public void userEditFeeAndChangeItTo(String existingFeeName, String newFeeName) throws InterruptedException {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.editFee(existingFeeName,newFeeName);
    }

    @And("User delete Fee {string}")
    public void userDeleteFee(String feeNameToDelete) throws InterruptedException {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.deleteFee(feeNameToDelete);

    }
}
