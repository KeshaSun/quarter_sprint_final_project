import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.hamcrest.CoreMatchers.is;
public class MakeOrderChromeTest {
    private WebDriver driver;


    @Test
    public void MakeOrder() {
        // создали драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // перешли на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Создать Page Object для Main page для работы
        MainPage objMainPage = new MainPage(driver);
        //Нажать на кнопку "Заказать"
        objMainPage.clicOnMakeOrderTop();
        //Создать Page Object для OrderModalOne для работы
        OrderModalOneForWhom objOrderModalOne = new OrderModalOneForWhom(driver);
        //Дождаться пока загрузится страница
        objOrderModalOne.waitForLoadHeader();
        //Заполнить поле "* Имя"
        objOrderModalOne.setName(String name);
        //Заполнить полe "* Фамилия"
        objOrderModalOne.setSurname(String surname);
        //Заполнить поле "* Адрес: куда привезти заказ"
        objOrderModalOne.setAddress(String address);
        //Заполнить поле "* Станция метро"
        objOrderModalOne.setMetroStation(String metroName);
        //Заполнить поле "* Телефон: на него позвонит курьер"
        objOrderModalOne.setTelephone(String telephone);
        //Нажать на кнопку "Далее"
        objOrderModalOne.clickOnNextButton();
        //Создать Page Object для ModalTwoForWhom для работы
        OrderModalTwoAboutRent objOrderModalTwo = new OrderModalTwoAboutRent(driver);
        //Проверить что страница ModalTwoForWhom загрузилась
        objOrderModalTwo.waitForLoadHeader();
        //Заполнить поле "* Когда привезти самокат"
        objOrderModalTwo.setWhenBringScooter(String data);
        //Заполнить поле "* Срок аренды"
        objOrderModalTwo.setRentalPeriod();
        //Нажать на кнопку "Заказать"
        objOrderModalTwo.clicOnMakeOrderButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalThreeWantToPlaceOrder objOrderModalThree = new OrderModalThreeWantToPlaceOrder(driver);
        //Проверить что страница OrderModalThree загрузилась
        objOrderModalThree.waitTilWantToMakeOrder();
        //Нажать на кнопку "Да"
        objOrderModalThree.clicYesButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalFourthPlacedOrder objOrderModalFourth = new OrderModalFourthPlacedOrder(driver);
        //Проверить что страница загрузилась
        objOrderModalFourth.waitForLoadHeader();
        //Проверить что текст совпадает Заказ оформлен
        String headerText = objOrderModalFourth.getHeaderText();
        MatcherAssert.assertThat(headerText, is(textFromHedder));




    }
}
