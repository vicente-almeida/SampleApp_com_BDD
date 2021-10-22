package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PriceOptionPage extends Utils {
    WebDriver driver;
    private By Click_Price = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
    private By Btn_Next = By.id("nextsendquote");

    public PriceOptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void formPriceOption() {
        assertTrue(driver.getTitle().contains("Select Price Option"), "A frase do título da página está errada.");

    }

    public void clickPrice() {
        driver.findElement(Click_Price).click();
        elementVisible(By.id("nextsendquote"), 30);

    }

    public void clickBtnNext() {
        driver.findElement(Btn_Next).click();

    }

    public void formSendQuote() {
        assertEquals(driver.findElement(By.xpath("//*[@id=\"finished-sub-container\"]/div[1]/div/div[2]")).getText(), "Main page");


    }
}
