import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {

    //Добавили поле driver
    private final WebDriver driver;

    //Добавили конструктор класса page object
    public MainPage(WebDriver driver) {
        this.driver = driver; // Инициализировали в нём поле driver
    }

    // Кнопка "Заказать' №1 в шапке
    private final By makeOrderTop = By.cssSelector(".Button_Button__ra12g");
    // Кнопка "Заказать" №2 в блоке "Как это работат"
    private final By makeOrderBot = By.cssSelector(".Home_FinishButton__1_cWm");
    //Вопрос о важном 1
    private final By firstImportantQuestion = By.id("accordion__heading-24");
    //Вопрос о важном 2
    private final By secondImportantQuestion = By.id("accordion__heading-25");
    //Вопрос о важном 3
    private final By thirdImportantQuestion = By.id("accordion__heading-26");
    //Вопрос о важном 4
    private final By fourthImportantQuestion = By.id("accordion__heading-27");
    //Вопрос о важном 5
    private final By fifthImportantQuestion = By.id("accordion__heading-28");
    //Вопрос о важном 6
    private final By sixthImportantQuestion = By.id("accordion__heading-29");
    //Вопрос о важном 7
    private final By SeventhImportantQuestion = By.id("accordion__heading-30");
    //Вопрос о важном 8
    private final By EighthImportantQuestion = By.id("accordion__heading-31");

    // Метод клика по кнопке "Заказать' №1 в шапке
    public void clicOnMakeOrderTop() {
        driver.findElement(makeOrderTop).click();
    }
    // Метод клика по кнопке "Заказать' №2 в шапке
        public void clicOnMakeOrderBot() {
            driver.findElement(makeOrderBot).click();
    }
}
