package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SendQuotePage extends Utils {
    WebDriver driver;
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By username = By.id("username");
    private By password = By.id("password");
    private By Confirm_Password = By.id("confirmpassword");
    private By comments = By.id("Comments");
    private By Btn_Send = By.id("sendemail");
    private By Btn_OK = By.className("confirm");
    private By msgSuccess = By.xpath("/html/body/div[4]/h2");


    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void formSendQuote() {
        assertTrue(driver.getTitle().contains("Send Quote"), "A frase do título da página está errada!");
    }

    public void fieldEmail() {
        driver.findElement(email).sendKeys("teste@teste.com");
    }

    public void fieldPhone() {
        driver.findElement(phone).sendKeys("51995212033");
    }

    public void fieldUserName() {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys("Visconde_De_Maua");

    }

    public void fieldPassword() {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("Visco_135");
    }

    public void fieldConfirmPassowrd() {
        driver.findElement(Confirm_Password).sendKeys("Visco_135");

    }

    public void fieldComments() {
        driver.findElement(comments).clear();
        driver.findElement(comments).sendKeys("O teste vai passar!");
    }


    public void btnSend() {
        driver.findElement(Btn_Send).click();
        elementVisible(Btn_OK, 30);
    }

    public void messageSuccess() {
        assertEquals(driver.findElement(msgSuccess).getText(), "Sending e-mail success!");

    }

    public void okBtn() {
        driver.findElement(Btn_OK).click();
    }

}
