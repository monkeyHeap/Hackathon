package en.ucstorefront.appareluk.local.cucumberhackaton.page.login;

import en.ucstorefront.appareluk.local.cucumberhackaton.base.Base;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps extends LoginPage{
    protected WebDriver driver = Base.getDefaultDriver();

    public LoginSteps(){
        PageFactory.initElements(driver, this);
    }

    @When("^goto login page$")
    public void gotoLogInPage(){
        driver.findElement(By.xpath("//*[@class=\"liOffcanvas\"]/a")).click();
    }


    @When("^Login \"([^\"]*)\" \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        getUserTextField().sendKeys(user);
        getPasswordTextField().sendKeys(psw);
        getLogInButton().click();
    }
}
