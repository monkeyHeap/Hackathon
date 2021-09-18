package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import en.ucstorefront.appareluk.local.cucumberhackaton.utility.Browsers;
import en.ucstorefront.appareluk.local.cucumberhackaton.utility.ServerConfig;
import en.ucstorefront.appareluk.local.cucumberhackaton.utility.StepManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.aeonbits.owner.ConfigFactory;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

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

    private final ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
    public static final StepManager page = new StepManager();

    public static String geBrowser(){
        if (System.getProperty("browser") != null)
            return System.getProperty("browser");
        else
            return "chrome";
    }

    @Before
    public void setUp() {
        driver = Browsers.valueOf(geBrowser().toUpperCase()).create();;
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(serverConfig.url());
        page.init();
    }

    @After
    public void close() {
        driver.manage().deleteAllCookies();
        driver.close();

    }
}
