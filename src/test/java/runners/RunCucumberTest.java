package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import suport.Web;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"@forms_execute"},
        glue = {"steps"}
)
public class RunCucumberTest {
    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = Web.createChrome();
    }

    /*@AfterClass
    public static void stop() {
        driver.quit();
    }

     */


}
