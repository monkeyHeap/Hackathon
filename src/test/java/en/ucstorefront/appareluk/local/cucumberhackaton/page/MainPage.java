package en.ucstorefront.appareluk.local.cucumberhackaton.page;

import en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    protected WebDriver driver = Base.getDefaultDriver();

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()=\"Snowboard Ski Tool Toko Ergo Multi Guide yellow\"]")
    public WebElement productSnowboardSky;

    @FindBy(xpath = "//a[@title=\"Brands\"]")
    public WebElement buttonBrands;

    @FindBy(xpath = "//a[@title=\"Streetwear\"]")
    public WebElement buttonStreetwear;

    @FindBy(xpath = "//a[@title=\"Snow\"]")
    public WebElement buttonSnow;

    @FindBy(xpath = "//a[@title=\"Accessories\"]")
    public WebElement buttonAccessories;

    @FindBy(xpath = "//a[@title=\"Youth\"]")
    public WebElement buttonYouth;

    @FindBy(xpath = "//div[@class=\"nav-location hidden-xs\"]")
    public WebElement buttonShopLocation;

    @FindBy(xpath = "//li/div/div/div[@class=\"nav-order-tools js-nav-order-tools display-none NAVcompONENT\"]")
    public WebElement buttonOrderTools;

    @FindBy(xpath = "//li/div/div/div/nav/div/a[@title=\"Quick Order\"]")
    public WebElement quckOrderButton;

    @FindBy(xpath = "//li[@class=\"liOffcanvas\"]")
    public WebElement logOutButton;

    @FindBy(xpath = "//a[@href=\"/ucstorefront/en/login\"]")
    public WebElement logButton;
}
