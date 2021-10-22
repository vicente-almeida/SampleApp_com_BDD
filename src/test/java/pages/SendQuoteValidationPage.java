package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendQuoteValidationPage {
    WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By Confirm_Password = By.id("confirmpassword");
    private By comments = By.id("Comments");
    private By msg1 = By.xpath("/html/body/div[4]/h2");
    private By msg2 = By.xpath("/html/body/div[4]/p");

    public SendQuoteValidationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fieldUserNameValidation() {
        driver.findElement(username).sendKeys("Vicente_Almeida");
    }

    public void fieldPasswordValidation() {
        driver.findElement(password).sendKeys("Vi_1357");

    }

    public void fieldConfirmPasswordValidation() {
        driver.findElement(Confirm_Password);
    }

    public void fieldCommentsValidation() {
        driver.findElement(comments).sendKeys("Validação Mensagem sem preenchimento de campo obrigatório");

    }

    public void messageValidation() {
        assertEquals(driver.findElement(msg1).getText(), "Not finished yet...");
        assertEquals(driver.findElement(msg2).getText(), "There is still some data missing!");


    }

    public void btnOKMessage() {
        driver.findElement(By.className("confirm")).click();
    }


}


