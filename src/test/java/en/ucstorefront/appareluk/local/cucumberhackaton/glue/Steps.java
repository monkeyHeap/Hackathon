package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import en.ucstorefront.appareluk.local.cucumberhackaton.base.Base;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {


    @When("^Проверить строку WELCOME$")
    public void checkFieldWelcome(){
        Assert.assertTrue(Base.page.headerPage().loginNameLabel.isDisplayed());
    }

    @When("^Войти под пользователем \"([^\"]*)\" с паролем \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        Base.page.loginPage().userTextField.sendKeys(user);
        Base.page.loginPage().passwordTextField.sendKeys(psw);
        Base.page.loginPage().logInButton.click();
    }

    @When("^Перейти на страницу логина$")
    public void gotoLogInPage(){
        Base.page.headerPage().gotoLoginButton.click();
    }
}
