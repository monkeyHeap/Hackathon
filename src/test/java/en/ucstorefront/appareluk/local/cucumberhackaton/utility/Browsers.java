package en.ucstorefront.appareluk.local.cucumberhackaton.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum Browsers {
    CHROME {
        public WebDriver create(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--ignore-certificate-errors");
            option.addArguments("--headless");
            return new ChromeDriver(option);
        }
    },
    IE {
        public WebDriver create(){
            return new InternetExplorerDriver();
        }
    },
    FIREFOX {
        public WebDriver create() {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    };

    public WebDriver create(){
        return null;
    }
}
