package pages.SelectFuelType;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectFuelType extends BasePage {

    public SelectFuelType(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }

    @Step("Select Fuel Type")
    public void selectFuelType() {
        waitElement("FirstFuelType");
        element("FirstFuelType").click();
    }

}
