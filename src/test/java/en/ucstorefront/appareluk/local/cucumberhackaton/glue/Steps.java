package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {


    @When("^Check field WELCOME$")
    public void checkFieldWelcome(){
        Assert.assertTrue(Base.page.headerPage().loginNameLabel.isDisplayed());
    }

    @When("^Login \"([^\"]*)\" password \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        Base.page.loginPage().userTextField.sendKeys(user);
        Base.page.loginPage().passwordTextField.sendKeys(psw);
        Base.page.loginPage().logInButton.click();
    }

    @When("^Goto login page$")
    public void gotoLogInPage(){
        Base.page.headerPage().gotoLoginButton.click();
    }

    @When("^Выбрать товар$")
    public void chooseProduct(){
        Base.page.mainPage().productSnowboardSky.click();
    }

    @When("^Добавить в корзину$")
    public void addToBag(){
        Base.page.addToBagPage().buttonAddToBag.click();
    }

    @When("^Просмотреть корзину$")
    public void gotoBasket(){
        Base.page.addToBagPage().buttonCheckOut.click();
    }

    @When("^Переход на страницу Brand$")
    public void gotoBrandPage(){
        Base.page.mainPage().buttonBrands.click();
    }

    @When("^Переход на страницу Streetwear$")
    public void gotoStreetwearPage(){
        Base.page.mainPage().buttonStreetwear.click();
    }

    @When("^Переход на страницу Snow$")
    public void gotoSnowPage() {
        Base.page.mainPage().buttonSnow.click();
    }

    @When("^Переход на страницу Accessories$")
    public void gotoAccessoriesPage(){
        Base.page.mainPage().buttonAccessories.click();
    }

    @When("^Переход на страницу Youth$")
    public void gotoYouthPage(){
        Base.page.mainPage().buttonYouth.click();
    }

    @When("^Поиск товара \"([^\"]*)\"$")
    public void searchYouthPantPeach(String item){
        Base.page.mainPage().buttonYouth.click();
        Base.page.youthPage().SearchField.sendKeys(item);
        Base.page.youthPage().searchButton.click();
    }

    @When("^Проверка первого отображенного элемента поиска$")
    public void checkFirstSearchElement(){
        Assert.assertEquals("Поиск неверно вывел первый по списку товар", Base.page.searchPage().firstSearchElement.getText(), "Plan B Youth Pant peach XL");
    }

    @When("^Переход на страницу списка магазинов$")
    public void checkShopLocationPage(){
        Base.page.mainPage().buttonShopLocation.click();
    }

    @When("^Переход на страницу QuickOrder$")
    public void gotoShopLocationPage(){
        Base.page.mainPage().buttonOrderTools.click();
        Base.page.mainPage().quckOrderButton.click();
    }

    @When("^Выйти из учетной записи$")
    public void logIn() {
        Base.page.mainPage().logButton.click();
        Base.page.loginPage().userTextField.sendKeys("monkeyheap@yandex.ru");
        Base.page.loginPage().passwordTextField.sendKeys("qwer1234");
        Base.page.loginPage().logInButton.click();
        Base.page.mainPage().logOutButton.click();
    }
}
