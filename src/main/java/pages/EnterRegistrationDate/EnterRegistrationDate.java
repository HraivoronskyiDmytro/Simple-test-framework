package pages.EnterRegistrationDate;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EnterRegistrationDate extends BasePage {

    public EnterRegistrationDate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }

    @Step("Enter Registration Date")
    public void enterRegistrationDate() {
        waitElement("Date");
        element("Date").sendKeys("02.2020");
        element("Submit").click();
    }


}
