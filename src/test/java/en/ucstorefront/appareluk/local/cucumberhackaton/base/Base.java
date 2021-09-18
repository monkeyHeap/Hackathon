package en.ucstorefront.appareluk.local.cucumberhackaton.base;

import en.ucstorefront.appareluk.local.cucumberhackaton.page.header.HeaderPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.login.LoginPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.utility.StepManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.geom.GeneralPath;
import java.util.concurrent.TimeUnit;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "java/en/ucstorefront/appareluk/local/cucumberhackaton/",
        tags = "@all"
)
public class Base {

    public static WebDriver driver;
    public LoginPage loginPage;
    public HeaderPage headerPage;

    public static WebDriver getDefaultDriver() {
        return driver;
    }

    private static final String BASE_URL = "https://apparel-uk.local:9002/ucstorefront/en/";
    protected static final StepManager page = new StepManager();

    @Before
    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        page.init();
    }

    @After
    public void close() {
        driver.close();
    }
}
