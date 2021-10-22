package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {
    public void elementVisible(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomWebSite() {
        String nameinit = "www.";
        String name = "teste";
        String namefinal = ".com.br";
        Random random = new Random();
        int minimo = 1;
        int maximo = 9999;
        int resultado = random.nextInt(maximo-minimo)+minimo;

        return nameinit+name+resultado+namefinal;

    }

    public String getRandowEnginerPerformance(){
        String numberinit = "10";
        String numberfinal = "0";
        Random random = new Random();
        int minimo = 1;
        int maximo = 9;
        int resultado = random.nextInt(maximo-minimo)+minimo;

        return numberinit+resultado+numberfinal;
    }
}
