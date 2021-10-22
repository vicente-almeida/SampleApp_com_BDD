package suport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private static WebDriver driver;

    public static WebDriver createChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;

    }
}
