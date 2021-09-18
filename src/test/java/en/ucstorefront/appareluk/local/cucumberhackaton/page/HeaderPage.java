package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base;
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



}
