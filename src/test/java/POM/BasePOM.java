package POM;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePOM {
    // tekrar kullanılabilir olan metotları ekleyeceğiz page class için

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public void waitUntilVisibleAndClickableThenClick(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }




}
