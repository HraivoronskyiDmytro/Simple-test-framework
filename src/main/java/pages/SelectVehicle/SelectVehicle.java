package pages.SelectVehicle;


import framework.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SelectVehicle extends BasePage {

    public SelectVehicle(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitUntilPageLoads() {

    }

    @Step("Click Search by Manufacturer and Model button")
    public void clickSearchByModel() {
        element("Search").click();
    }

    @Step("Select {0} manufacturer ")
    public void selectManufacturer(String name) {
        waitElement("InputManufacturer");
        element("InputManufacturer").sendKeys(name);
        element("FirstManufacturer").click();


    }
}
