package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import io.cucumber.java.en.When;
import org.junit.Assert;

import static en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base.page;

public class Steps {


    @When("^Проверка поля WELCOME$")
    public void checkFieldWelcome(){
        Assert.assertTrue(page.headerPage().loginNameLabel.isDisplayed());
    }

    @When("^Логин \"([^\"]*)\" пароль \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        page.loginPage().userTextField.sendKeys(user);
        page.loginPage().passwordTextField.sendKeys(psw);
        page.loginPage().logInButton.click();
    }

    @When("^Переход на страницу авторизации$")
    public void gotoLogInPage(){
        page.headerPage().gotoLoginButton.click();
    }

    @When("^Выбрать товар$")
    public void chooseProduct(){
        page.mainPage().productSnowboardSky.click();
    }

    @When("^Добавить в корзину$")
    public void addToBag(){
        page.addToBagPage().buttonAddToBag.click();
    }

    @When("^Просмотреть корзину$")
    public void gotoBasket(){
        page.addToBagPage().buttonCheckOut.click();
    }

    @When("^Переход на страницу Brand$")
    public void gotoBrandPage(){
        page.mainPage().buttonBrands.click();
    }

    @When("^Переход на страницу Streetwear$")
    public void gotoStreetwearPage(){
        page.mainPage().buttonStreetwear.click();
    }

    @When("^Переход на страницу Snow$")
    public void gotoSnowPage() {
        page.mainPage().buttonSnow.click();
    }

    @When("^Переход на страницу Accessories$")
    public void gotoAccessoriesPage(){
        page.mainPage().buttonAccessories.click();
    }

    @When("^Переход на страницу Youth$")
    public void gotoYouthPage(){
        page.mainPage().buttonYouth.click();
    }

    @When("^Поиск товара \"([^\"]*)\"$")
    public void searchYouthPantPeach(String item){
        page.mainPage().buttonYouth.click();
        page.youthPage().SearchField.sendKeys(item);
        page.youthPage().searchButton.click();
    }

    @When("^Проверка первого отображенного элемента поиска$")
    public void checkFirstSearchElement(){
        Assert.assertEquals("Поиск неверно вывел первый по списку товар", page.searchPage().firstSearchElement.getText(), "Plan B Youth Pant peach XL");
    }

    @When("^Переход на страницу списка магазинов$")
    public void checkShopLocationPage(){
        page.mainPage().buttonShopLocation.click();
    }

    @When("^Переход на страницу QuickOrder$")
    public void gotoShopLocationPage(){
        page.mainPage().buttonOrderTools.click();
        page.mainPage().quckOrderButton.click();
    }

    @When("^Выйти из учетной записи$")
    public void logIn() {
        page.mainPage().logButton.click();
        page.loginPage().userTextField.sendKeys("monkeyheap@yandex.ru");
        page.loginPage().passwordTextField.sendKeys("qwer1234");
        page.loginPage().logInButton.click();
        page.mainPage().logOutButton.click();
    }
}
