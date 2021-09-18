package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    protected WebDriver driver = Base.getDefaultDriver();

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"product-item\"]/div/a[@href=\"/ucstorefront/en/Categories/Snowwear-youth/Snow-Pants-youth/Plan-B-Youth-Pant/p/300438086\"]")
    public  WebElement firstSearchElement;
}
