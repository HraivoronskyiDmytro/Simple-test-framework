package tests;


import framework.BaseTest;
import org.testng.annotations.Test;


public class WebTests extends BaseTest {


    @Test(description = "Sales funnel test", dataProvider = "test-data")
    public void salesFunnel(String manufacturer, String model) {

        open("https://hello.friday.de/");
        web.selectPrecondition.clickAgreeCookie();
        web.selectPrecondition.clickSubmitButton();
        web.selectRegisteredOwner.clickSubmitButton();
        web.selectVehicle.clickSearchByModel();
        web.selectVehicle.selectManufacturer(manufacturer);
        web.selectModel.selectModel(model);
        web.selectBodyType.selectBodyType();
        web.selectFuelType.selectFuelType();
        web.selectEnginePower.selectEnginePower();
        web.selectEngine.selectEngine();
        web.enterRegistrationDate.enterRegistrationDate();
        web.enterBirthDate.checkEnterBirthDatePageIsOpened();

    }
}
