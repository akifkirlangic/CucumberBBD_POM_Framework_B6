package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM{

    public NavigationBarElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Setup']/..")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']/..")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Countries']/..")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']/..")
    private WebElement citizenshipsButton;

    @FindBy(xpath = "//span[text()='Fees']/..")
    private WebElement feesButton;


    public void navigateToCountriesPage(){
        setupButton.click();
        parametersButton.click();
        countriesButton.click();
    }

    public void navigateToCitizenshipPage(){
        setupButton.click();
        parametersButton.click();
        citizenshipsButton.click();
    }

    public void navigateToFeesPage(){
        setupButton.click();
        parametersButton.click();
        feesButton.click();
    }



}
