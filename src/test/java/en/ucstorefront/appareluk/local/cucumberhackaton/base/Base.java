package en.ucstorefront.appareluk.local.cucumberhackaton.base;

import en.ucstorefront.appareluk.local.cucumberhackaton.page.login.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public LoginPage loginPage;

    public static WebDriver getDefaultDriver() {
        if (driver != null) {
            return driver;
        }
        //System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "./geckodriver");
        return driver;
    }

    private static final String BASE_URL = "https://apparel-uk.local:9002/ucstorefront/en/";

    @Before
    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        System.out.println("driver " + driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        loginPage = new LoginPage(driver);
    }

    @After
    public void close() {
        driver.close();
    }
}
