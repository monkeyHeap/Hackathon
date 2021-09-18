package en.ucstorefront.appareluk.local.cucumberhackaton.utility;

import en.ucstorefront.appareluk.local.cucumberhackaton.page.header.HeaderPage;
import en.ucstorefront.appareluk.local.cucumberhackaton.page.login.LoginPage;

public class StepManager {
    private HeaderPage headerPage;
    private LoginPage loginPage;

    public void init(){
        headerPage = new HeaderPage();
        loginPage = new LoginPage();
    }

    public LoginPage loginPage(){return loginPage;}
    public HeaderPage headerPage(){return headerPage;}
}
