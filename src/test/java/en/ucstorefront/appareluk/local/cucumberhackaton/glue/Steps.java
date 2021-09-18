package en.ucstorefront.appareluk.local.cucumberhackaton.glue;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base.driver;
import static en.ucstorefront.appareluk.local.cucumberhackaton.glue.Base.page;

public class Steps {

    JavascriptExecutor executor = (JavascriptExecutor) driver;

    @When("^Проверка поля WELCOME$")
    public void checkFieldWelcome() {
        Assert.assertTrue(page.headerPage().loginNameLabel.isDisplayed());
    }

    @When("^Логин \"([^\"]*)\" пароль \"([^\"]*)\"$")
    public void logIn(String user, String psw) {
        page.loginPage().userTextField.sendKeys(user);
        page.loginPage().passwordTextField.sendKeys(psw);

        executor.executeScript("arguments[0].click();", page.loginPage().logInButton);
    }

    @When("^Переход на страницу авторизации$")
    public void gotoLogInPage() {

        executor.executeScript("arguments[0].click();", page.headerPage().gotoLoginButton);
    }

    @When("^Выбрать товар$")
    public void chooseProduct() {

        executor.executeScript("arguments[0].click();", page.mainPage().productSnowboardSky);
    }

    @When("^Добавить в корзину$")
    public void addToBag() {

        executor.executeScript("arguments[0].click();", page.addToBagPage().buttonAddToBag);
    }

    @When("^Просмотреть корзину$")
    public void gotoBasket() {

        executor.executeScript("arguments[0].click();", page.addToBagPage().buttonCheckOut);
    }

    @When("^Переход на страницу Brand$")
    public void gotoBrandPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonBrands);
    }

    @When("^Переход на страницу Streetwear$")
    public void gotoStreetwearPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonStreetwear);
    }

    @When("^Переход на страницу Snow$")
    public void gotoSnowPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonSnow);
    }

    @When("^Переход на страницу Accessories$")
    public void gotoAccessoriesPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonAccessories);
    }

    @When("^Переход на страницу Youth$")
    public void gotoYouthPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonYouth);
    }

    @When("^Поиск товара \"([^\"]*)\"$")
    public void searchYouthPantPeach(String item) {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonYouth);
        page.youthPage().SearchField.sendKeys(item);
        executor.executeScript("arguments[0].click();", page.youthPage().searchButton);
    }

    @When("^Проверка первого отображенного элемента поиска$")
    public void checkFirstSearchElement() {
        Assert.assertEquals("Поиск неверно вывел первый по списку товар", page.searchPage().firstSearchElement.getText(), "Plan B Youth Pant peach XL");
    }

    @When("^Переход на страницу списка магазинов$")
    public void checkShopLocationPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonShopLocation);
    }

    @When("^Переход на страницу QuickOrder$")
    public void gotoShopLocationPage() {

        executor.executeScript("arguments[0].click();", page.mainPage().buttonOrderTools);
        executor.executeScript("arguments[0].click();", page.mainPage().quckOrderButton);
    }

    @When("^Выйти из учетной записи$")
    public void logIn() {
        executor.executeScript("arguments[0].click();", page.mainPage().logButton);
        page.loginPage().userTextField.sendKeys("monkeyheap@yandex.ru");
        page.loginPage().passwordTextField.sendKeys("qwer1234");
        executor.executeScript("arguments[0].click();", page.loginPage().logInButton);
        executor.executeScript("arguments[0].click();", page.mainPage().logOutButton);
    }
}
