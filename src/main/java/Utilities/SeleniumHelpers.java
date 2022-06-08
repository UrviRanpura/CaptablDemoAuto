package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelpers {
    WebDriver driver;
    JavaHelpers helper;
    Actions actions;

    public SeleniumHelpers(WebDriver driver) {
        this.driver = driver;
        helper = new JavaHelpers();
        actions = new Actions(driver);
    }

    public WebElement waitTillElementIsClickable(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_WAIT_DURATION));
        wait.until(ExpectedConditions.elementToBeClickable(e));
        return e;
    }
    public void javascriptClickOn(WebElement e) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
    }
    public void waitTillElementsCountIsLessThan(By by, int count) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_WAIT_DURATION));
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, count));
    }

    public WebElement pageScrollInView(WebElement e) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", e);
        return e;
    }
    public WebElement waitTillElementIsVisible(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.WEBDRIVER_WAIT_DURATION));
        wait.until(ExpectedConditions.visibilityOf(e));
        return e;
    }

    public void scrollDownUP(WebElement E){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", E);
    }

    public String getText(WebElement e) {
        return waitTillElementIsVisible(e).getText().trim();
    }
}
