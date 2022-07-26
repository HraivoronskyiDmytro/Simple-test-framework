package pages.SelectPrecondition;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectPrecondition extends BasePage {

    public SelectPrecondition(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }

    @Step("Pass cookie banner")
    public void clickAgreeCookie() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        try {
            Thread.sleep(3000); //value found empirically to wait for cookie banner
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(90));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Page isn't fully loaded");
        }
        element("Cookie banner").getShadowRoot().findElement(By.cssSelector("button.sc-gsDKAQ.hWjjep")).click();


    }
    @Step("Click Submit Button")
    public void clickSubmitButton() {
        element("Submit").click();

    }
}
