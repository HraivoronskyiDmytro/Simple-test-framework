package framework;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public abstract class BasePage {
    protected WebDriver driver = null;
    Util csv = new Util();

    protected BasePage(WebDriver driver) {
        setDriver(driver);
    }

    private void setDriver(WebDriver drv) {
        driver = drv;
    }

    public abstract void waitUntilPageLoads();

    public WebElement element(String name) {
        return (driver.findElement(csv.getLocator(name)));
    }

    @Step("Wait visibility of {0}")
    public void waitElement(String name) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(csv.getLocator(name)));
    }


}
