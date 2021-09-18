package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouthPage {

    protected WebDriver driver = Base.getDefaultDriver();

    public YouthPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"js-site-search-input\"]")
    public WebElement SearchField;

    @FindBy(xpath = "//button[@class=\"btn btn-link js_search_button\"]")
    public WebElement searchButton;


}
