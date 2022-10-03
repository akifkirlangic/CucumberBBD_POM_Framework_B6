package StepDefinition;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void setup() throws InterruptedException {
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        //Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            TakesScreenshot screenshot = ((TakesScreenshot) driver); // which driver to get a screenshot

            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            String scenarioName = scenario.getName(); // this for multiple failed scenario

            File destinationFile = new File("target/FailedScreeShots/" + scenarioName + ".png"); // this for multiple failed scenario
            //File destinationFile = new File("target/FailedScreeShots/screenshot.png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        Driver.quitDriver();
    }


}
