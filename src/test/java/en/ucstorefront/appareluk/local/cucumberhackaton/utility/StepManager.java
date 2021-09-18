package en.ucstorefront.appareluk.local.cucumberhackaton.utility;

import en.ucstorefront.appareluk.local.cucumberhackaton.page.AddToBagPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.MainPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.SearchPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.YouthPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.header.HeaderPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.login.LoginPage;

public class StepManager {
    private MainPage mainPage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private AddToBagPage addToBagPage;
    private YouthPage youthPage;
    private SearchPage searchPage;

    public void init(){
        mainPage = new MainPage();
        headerPage = new HeaderPage();
        loginPage = new LoginPage();
        addToBagPage = new AddToBagPage();
        youthPage = new YouthPage();
        searchPage = new SearchPage();
    }

    public LoginPage loginPage(){return loginPage;}
    public HeaderPage headerPage(){return headerPage;}
    public MainPage mainPage(){
        return mainPage;
    }
    public AddToBagPage addToBagPage(){
        return addToBagPage;
    }
    public YouthPage youthPage(){
        return youthPage;
    }
    public SearchPage searchPage(){
        return searchPage;
    }
}
