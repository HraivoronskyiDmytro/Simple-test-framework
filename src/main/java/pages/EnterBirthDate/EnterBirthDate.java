package pages.EnterBirthDate;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EnterBirthDate extends BasePage {

    public EnterBirthDate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }


    @Step("Check that Birth date page is opened")
    public void checkEnterBirthDatePageIsOpened(){
        waitElement("BirthDateInput");
        waitElement("Submit");
        Assert.assertEquals(element("Title").getText(),"Wann wurdest du geboren?");
    }
}