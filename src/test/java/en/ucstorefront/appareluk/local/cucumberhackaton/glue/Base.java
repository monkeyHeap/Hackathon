package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import en.ucstorefront.appareluk.local.cucumberhackaton.utility.StepManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

@RunWith(Courgette.class)
@CourgetteOptions(
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        showTestOutput = true,
        reportTitle = "Courgette-JVM Example",
        reportTargetDir = "build",
        environmentInfo = "browser=chrome; git_branch=master",
        cucumberOptions = @CucumberOptions(
        features = "src/test/resources/feature",
        glue = "en/ucstorefront/appareluk/local/cucumberhackaton/glue"
))
public class Base {

    public static WebDriver driver;

    public static WebDriver getDefaultDriver() {
        return driver;
    }

    private static final String BASE_URL = "https://apparel-uk.local:9002/ucstorefront/en/";
    public static final StepManager page = new StepManager();

    @Before
    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--ignore-certificate-errors");
        option.addArguments("--headless");
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
