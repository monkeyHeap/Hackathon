package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import io.cucumber.java.en.When;

public class Steps {

    @When("^Login \"([^\"]*)\" \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        Base.page.loginPage().userTextField.sendKeys(user);
        Base.page.loginPage().passwordTextField.sendKeys(psw);
        Base.page.loginPage().logInButton.click();
    }

    @When("^goto login page$")
    public void gotoLogInPage(){
        Base.page.headerPage().gotoLoginButton.click();
    }
}
