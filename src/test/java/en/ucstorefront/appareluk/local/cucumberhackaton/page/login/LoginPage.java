package en.ucstorefront.appareluk.local.cucumberhackaton.page.login;

import en.ucstorefront.appareluk.local.cucumberhackaton.base.Base;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



    @FindBy(xpath = "//*[@id=\"j_username\"]")
    private WebElement userTextField;

    @FindBy(xpath = "//*[@id=\"j_password\"]")
    private WebElement passwordTextField;

    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-block\"]")
    private WebElement logInButton;

    public WebElement getUserTextField() {
        return userTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }
}
