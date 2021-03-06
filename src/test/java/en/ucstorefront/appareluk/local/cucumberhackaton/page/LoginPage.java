package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    protected WebDriver driver = Base.getDefaultDriver();

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"j_username\"]")
    public WebElement userTextField;

    @FindBy(xpath = "//*[@id=\"j_password\"]")
    public WebElement passwordTextField;

    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-block\"]")
    public WebElement logInButton;



}
