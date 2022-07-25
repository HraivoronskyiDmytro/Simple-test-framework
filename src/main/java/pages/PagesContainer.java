package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

import pages.EnterBirthDate.EnterBirthDate;
import pages.EnterRegistrationDate.EnterRegistrationDate;
import pages.SelectBodyType.SelectBodyType;
import pages.SelectEngine.SelectEngine;
import pages.SelectEnginePower.SelectEnginePower;
import pages.SelectFuelType.SelectFuelType;
import pages.SelectModel.SelectModel;
import pages.SelectPrecondition.SelectPrecondition;
import pages.SelectRegisteredOwner.SelectRegisteredOwner;
import pages.SelectVehicle.SelectVehicle;


public class PagesContainer extends BasePage {
    public SelectPrecondition selectPrecondition = new SelectPrecondition(driver);
    public SelectRegisteredOwner selectRegisteredOwner = new SelectRegisteredOwner(driver);
    public SelectVehicle selectVehicle = new SelectVehicle(driver);
    public SelectBodyType selectBodyType = new SelectBodyType(driver);
    public SelectEngine selectEngine = new SelectEngine(driver);
    public SelectEnginePower selectEnginePower = new SelectEnginePower(driver);
    public SelectFuelType selectFuelType = new SelectFuelType(driver);
    public SelectModel selectModel = new SelectModel(driver);
    public EnterBirthDate enterBirthDate = new EnterBirthDate(driver);
    public EnterRegistrationDate enterRegistrationDate = new EnterRegistrationDate(driver);
    public PagesContainer(WebDriver driver) {
        super(driver);

    }

    @Override
    public void waitUntilPageLoads() {

    }


}

