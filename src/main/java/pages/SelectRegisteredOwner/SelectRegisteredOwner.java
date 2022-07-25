package pages.SelectRegisteredOwner;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SelectRegisteredOwner extends BasePage {

    public SelectRegisteredOwner(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }


    @Step("Click Submit Button")
    public void clickSubmitButton() {
        element("Submit").click();


    }

}
