package pages.SelectModel;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SelectModel extends BasePage {

    public SelectModel(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {
//        element("Homepage Content").shouldBe(Condition.visible);
    }

    //
    @Step("Select {0} Model ")
    public void selectModel(String name) {
        waitElement("InputModel");
        element("InputModel").sendKeys(name);
        element("FirstModel").click();


    }
}
