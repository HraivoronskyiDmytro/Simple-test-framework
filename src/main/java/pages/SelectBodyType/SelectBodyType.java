package pages.SelectBodyType;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectBodyType extends BasePage {

    public SelectBodyType(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }


    @Step("Select First Body Type")
    public void selectBodyType() {
        waitElement("FirstBodyType");
        element("FirstBodyType").click();
    }


}
