package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBagPage {

    protected WebDriver driver = Base.getDefaultDriver();

    public AddToBagPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='addToCartButton']")
    public WebElement buttonAddToBag;

    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-block add-to-cart-button\"]")
    public WebElement buttonCheckOut;
}
