package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {


    @When("^Check field WELCOME$")
    public void checkFieldWelcome(){
        Assert.assertTrue(Base.page.headerPage().loginNameLabel.isDisplayed());
    }

    @When("^Login \"([^\"]*)\" password \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        Base.page.loginPage().userTextField.sendKeys(user);
        Base.page.loginPage().passwordTextField.sendKeys(psw);
        Base.page.loginPage().logInButton.click();
    }

    @When("^Goto login page$")
    public void gotoLogInPage(){
        Base.page.headerPage().gotoLoginButton.click();
    }
}
