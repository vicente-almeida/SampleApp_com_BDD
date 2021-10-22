package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleDataPage extends Utils {
    WebDriver driver;
    private By linkAutomobile = By.id("nav_automobile");
    private By fieldMake = By.id("make");
    private By enginePerformance = By.id("engineperformance");
    private By dateManufacture = By.id("dateofmanufacture");
    private By numberOfSeats = By.id("numberofseats");
    private By fuelType = By.id("fuel");
    private By listPrice = By.id("listprice");
    private By licensePlateNumber = By.id("licenseplatenumber");
    private By annualMileage = By.id("annualmileage");
    private By btnNext = By.id("nextenterinsurantdata");


    public VehicleDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("http://sampleapp.tricentis.com/101/");
        driver.manage().window().maximize();
    }

    public void clickLinkAutomobile() {
        driver.findElement(linkAutomobile).click();


    }

    public void fieldMake(String make_) {
        driver.findElement(fieldMake).click();
        Select make = new Select(driver.findElement(fieldMake));
        make.selectByValue(make_);
    }

    public void fieldEnginePerformance() {
        driver.findElement(enginePerformance).sendKeys(getRandowEnginerPerformance());
    }

    public void fieldDateManufacture(String DateManufacture) {

        driver.findElement(dateManufacture).sendKeys(DateManufacture);
    }

    public void fieldNumberSeats() {
        driver.findElement(numberOfSeats).click();
        driver.findElement(numberOfSeats).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void fieldFuelType() {
        driver.findElement(fuelType).click();
        driver.findElement(fuelType).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

    }

    public void fieldListPrice(String ListPrice) {
        driver.findElement(listPrice).sendKeys(ListPrice);


    }
    public void fieldLicensePlateNumber(String License){
        driver.findElement(licensePlateNumber).sendKeys(License);

    }

    public void fieldAnnualMileage(String Mileage) {
        driver.findElement(annualMileage).sendKeys(Mileage);
    }


    public void btnNext() {

        driver.findElement(btnNext).click();
    }

    public void formInsurantData() {
        assertTrue(driver.getTitle().contains("Enter Insurant Data"), "A frase do título da página está errada!!");
    }
}
