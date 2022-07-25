package pages.SelectEnginePower;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectEnginePower extends BasePage {

    public SelectEnginePower(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }

    @Step("Select first engine power")
    public void selectEnginePower() {
        waitElement("FirstEnginePower");
        element("FirstEnginePower").click();
    }

}
