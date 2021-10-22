package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductDataPage {
    WebDriver driver;
    private By startDate = By.id("startdate");
    private By Insurance_Sum = By.id("insurancesum");
    private By Merit_Rating = By.id("meritrating");
    private By Damage_Insurance = By.id("damageinsurance");
    private By Optional_Products = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
    private By Courtesy_Car = By.id("courtesycar");
    private By Button_Next = By.id("nextselectpriceoption");

    public ProductDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void formProductData() {
        assertTrue(driver.getTitle().contains("Enter Product Data"), "A frase do título da página está errada.");

    }

    public void fieldStartDate(String Date) {
        driver.findElement(startDate).sendKeys(Date);
    }

    public void fieldInsuranceSum(Integer Sum) {
        Select sums = new Select(driver.findElement(Insurance_Sum));
        sums.selectByIndex(Sum);
    }

    public void fieldMeritRating(String Rating) {
        Select ratings = new Select(driver.findElement(Merit_Rating));
        ratings.selectByVisibleText(Rating);
    }

    public void fieldDamageInsurance(Integer Damage) {
        Select damage = new Select(driver.findElement(Damage_Insurance));
        damage.selectByIndex(Damage);

    }

    public void fieldOptionalProducts() {
        driver.findElement(Optional_Products).click();

    }

    public void fieldCourtesyCar(Integer Courtesy) {
        Select courtesy = new Select(driver.findElement(Courtesy_Car));
        courtesy.selectByIndex(Courtesy);
    }


    public void buttonNext() {

        driver.findElement(Button_Next).click();
    }

    public void formselectPrice() {
        assertTrue(driver.getTitle().contains("Select Price Option"), "A frase do título da página está errada.");

    }
}
