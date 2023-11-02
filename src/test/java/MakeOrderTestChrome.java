import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.CoreMatchers.*;

@RunWith(Parameterized.class)
public class MakeOrderTestChrome {
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String data;
    private final String textFromHeader;
    private WebDriver driver;

    public MakeOrderTestChrome(String name, String surname, String address, String telephone,
                               String data, String textFromHeader ) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.data = data;
        this.textFromHeader = textFromHeader;
    }

        @Parameterized.Parameters

        public static Object[][] getSumData() {
            return new Object[][] {
                    { "Иван", "Иванов", "ул. Ленина д.5","+79999999999","01.11.2023","Заказ оформлен"},
                    { "Петр", "Петров", "ул. Тленина д.5","+79999999999","01.11.2023","Заказ оформлен"},
            };
        }
   @Before
   public void setUp() {
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver();

   }
    @Test
    public void MakeOrderChromeTopOrderButton() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Создать Page Object для Main page для работы
        MainPage objMainPage = new MainPage(driver);
        //Нажать на кнопку кук
        objMainPage.clicOnCookieButton();
        //Нажать на кнопку "Заказать"
        objMainPage.clicOnMakeOrderTop();
        //Создать Page Object для OrderModalOne для работы
        OrderModalOneForWhom objOrderModalOne = new OrderModalOneForWhom(driver);
        //Дождаться пока загрузится страница
        //objOrderModalOne.waitForLoadHeader();
        //Заполнить поле "* Имя"
        objOrderModalOne.setName(name);
        //Заполнить полe "* Фамилия"
        objOrderModalOne.setSurname(surname);
        //Заполнить поле "* Адрес: куда привезти заказ"
        objOrderModalOne.setAddress(address);
        //Заполнить поле "* Станция метро"
        objOrderModalOne.setMetroStation();
        //Заполнить поле "* Телефон: на него позвонит курьер"
        objOrderModalOne.setTelephone(telephone);
        //Нажать на кнопку "Далее"
        objOrderModalOne.clickOnNextButton();
        //Создать Page Object для ModalTwoForWhom для работы
        OrderModalTwoAboutRent objOrderModalTwo = new OrderModalTwoAboutRent(driver);
        //Проверить что страница ModalTwoForWhom загрузилась
        //objOrderModalTwo.waitForLoadHeader();
        //Заполнить поле "* Когда привезти самокат"
        objOrderModalTwo.setWhenBringScooter(data);
        //Заполнить поле "* Срок аренды"
        objOrderModalTwo.setRentalPeriod();
        //Нажать на кнопку "Заказать"
        objOrderModalTwo.clicOnMakeOrderButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalThreeWantToPlaceOrder objOrderModalThree = new OrderModalThreeWantToPlaceOrder(driver);
        //Проверить что страница OrderModalThree загрузилась
        //objOrderModalThree.waitTilWantToMakeOrder();
        //Нажать на кнопку "Да"
        objOrderModalThree.clicYesButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalFourthPlacedOrder objOrderModalFourth = new OrderModalFourthPlacedOrder(driver);
        //Проверить что страница загрузилась
       // objOrderModalFourth.waitForLoadHeader();
        //Проверить что текст совпадает Заказ оформлен
        String headerText = objOrderModalFourth.getHeaderText();
        MatcherAssert.assertThat(headerText, containsString(textFromHeader));
    }

    @Test
    public void MakeOrderChromeBotOrderButton() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //Создать Page Object для Main page для работы
        MainPage objMainPage = new MainPage(driver);
        //Нажать на кнопку кук
        objMainPage.clicOnCookieButton();
        //Нажать на кнопку "Заказать"
        objMainPage.clicOnMakeOrderBot();
        //Создать Page Object для OrderModalOne для работы
        OrderModalOneForWhom objOrderModalOne = new OrderModalOneForWhom(driver);
        //Дождаться пока загрузится страница
        //objOrderModalOne.waitForLoadHeader();
        //Заполнить поле "* Имя"
        objOrderModalOne.setName(name);
        //Заполнить полe "* Фамилия"
        objOrderModalOne.setSurname(surname);
        //Заполнить поле "* Адрес: куда привезти заказ"
        objOrderModalOne.setAddress(address);
        //Заполнить поле "* Станция метро"
        objOrderModalOne.setMetroStation();
        //Заполнить поле "* Телефон: на него позвонит курьер"
        objOrderModalOne.setTelephone(telephone);
        //Нажать на кнопку "Далее"
        objOrderModalOne.clickOnNextButton();
        //Создать Page Object для ModalTwoForWhom для работы
        OrderModalTwoAboutRent objOrderModalTwo = new OrderModalTwoAboutRent(driver);
        //Проверить что страница ModalTwoForWhom загрузилась
        //objOrderModalTwo.waitForLoadHeader();
        //Заполнить поле "* Когда привезти самокат"
        objOrderModalTwo.setWhenBringScooter(data);
        //Заполнить поле "* Срок аренды"
        objOrderModalTwo.setRentalPeriod();
        //Нажать на кнопку "Заказать"
        objOrderModalTwo.clicOnMakeOrderButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalThreeWantToPlaceOrder objOrderModalThree = new OrderModalThreeWantToPlaceOrder(driver);
        //Проверить что страница OrderModalThree загрузилась
        //objOrderModalThree.waitTilWantToMakeOrder();
        //Нажать на кнопку "Да"
        objOrderModalThree.clicYesButton();
        //Создать Page Object для OrderModalThree для работы
        OrderModalFourthPlacedOrder objOrderModalFourth = new OrderModalFourthPlacedOrder(driver);
        //Проверить что страница загрузилась
        // objOrderModalFourth.waitForLoadHeader();
        //Проверить что текст совпадает Заказ оформлен
        String headerText = objOrderModalFourth.getHeaderText();
        MatcherAssert.assertThat(headerText, containsString(textFromHeader));
    }

   @After
   public void tearDown() {
        // Закрой браузер
       driver.quit();
   }

}
