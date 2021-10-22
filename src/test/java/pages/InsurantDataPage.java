package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import suport.Utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsurantDataPage extends Utils {
    WebDriver driver;
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By birthdate = By.id("birthdate");
    private By gender = By.className("ideal-radio");
    private By country = By.id("country");
    private By zipCoude = By.id("zipcode");
    private By city = By.id("city");
    private By ocuppation = By.id("occupation");
    private By hobbies = By.className("ideal-check");
    private By btnopen = By.id("open");
    private By webSite = By.id("website");
    private By buttonNext = By.id("nextenterproductdata");

    public InsurantDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void formInsurantData() {
        assertTrue(driver.getTitle().contains("Enter Insurant Data"), "A frase do título da página está errada.");
    }

    public void fieldName(String name) {

        driver.findElement(firstName).sendKeys(name);
    }

    public void fieldSurname(String surname) {
        driver.findElement(lastName).sendKeys(surname);
    }

    public void fieldBirthdate(String birthdate_date) {
        driver.findElement(birthdate).sendKeys(birthdate_date);
    }

    public void fieldGender() {
        driver.findElement(gender).click();
    }

    public void fieldCountry() {
        driver.findElement(country).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void fieldZipCoude() {
        driver.findElement(zipCoude).sendKeys("91920290");

    }

    public void fieldCity() {
        driver.findElement(city).sendKeys("Porto Alegre");
    }

    public void fieldOcuppation() {
        driver.findElement(ocuppation).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void fieldHobbies() {
        driver.findElement(hobbies).click();
    }


    public void fieldWebSite() {
        driver.findElement(webSite).sendKeys(getRandomWebSite());
    }

    public void btnNext() {

        driver.findElement(buttonNext).click();
    }

    public void formProductData() {
        assertTrue(driver.getTitle().contains("Enter Product Data"), "A frase do título da página está errada.");

    }
}



