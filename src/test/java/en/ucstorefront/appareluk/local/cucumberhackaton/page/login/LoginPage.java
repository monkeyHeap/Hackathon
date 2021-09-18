package en.ucstorefront.appareluk.local.cucumberhackaton.page.login;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"j_username\"]")
    private WebElement userTextField;
    @FindBy(xpath = "//*[@id=\"j_password\"]")
    private WebElement passwordTextField;

    @When("^Login \"([^\"]*)\" \"([^\"]*)\"$")
    public void logIn(String user, String psw){
        userTextField.sendKeys(user);
        passwordTextField.sendKeys(psw);
    }
}
