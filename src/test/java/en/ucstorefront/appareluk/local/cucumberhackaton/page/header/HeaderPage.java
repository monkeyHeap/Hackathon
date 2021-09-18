package en.ucstorefront.appareluk.local.cucumberhackaton.page.header;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage {

    @FindBy(xpath = "//*[@class=\"liOffcanvas\"]/a")
    private WebElement gotoLoginButton;


    @When("^goto login page$")
    public void gotoLogInPage(){
        gotoLoginButton.click();
    }
}
