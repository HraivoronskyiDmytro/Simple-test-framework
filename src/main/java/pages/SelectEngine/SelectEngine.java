package pages.SelectEngine;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectEngine extends BasePage {

    public SelectEngine(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }


    @Step("Select first engine in the list")
    public void selectEngine() {
        waitElement("FirstEngine");
        element("FirstEngine").click();
    }

}
