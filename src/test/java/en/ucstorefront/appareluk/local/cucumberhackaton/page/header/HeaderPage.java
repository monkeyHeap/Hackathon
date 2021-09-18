package en.ucstorefront.appareluk.local.cucumberhackaton.page.header;

import en.ucstorefront.appareluk.local.cucumberhackaton.base.Base;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    protected WebDriver driver = Base.getDefaultDriver();

    public HeaderPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"liOffcanvas\"]/a")
    public WebElement gotoLoginButton;

    @FindBy(xpath = "//*[@class=\"logged_in js-logged_in\"]")
    public WebElement loginNameLabel;



}
