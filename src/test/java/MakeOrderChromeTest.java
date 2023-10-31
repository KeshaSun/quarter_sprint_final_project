import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        //Создали Page Object для Main page для работы
        MainPage objMainPage = new MainPage(driver);
        //Нажать на кнопку "Заказать"
        //Заполнить поле "* Имя"
        //Заполнить полe "* Фамилия"
        //Заполнить поле "* Адрес: куда привезти заказ"
        //Заполнить поле "* Станция метро"
        //Заполнить поле "* Станция метро"
        //Заполнить поле "* Телефон: на него позвонит курьер"
        //Нажать на кнопку "Далее"
        //Создали Page Object для OrderModalOneForWhom для работы
        //Проверить что страница ModalOneForWhom загрузилась
        //




    }
}
