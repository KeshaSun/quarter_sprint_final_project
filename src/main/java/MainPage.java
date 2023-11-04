import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class MainPage {

    //Добавили поле driver
    private final WebDriver driver;

    //Добавили конструктор класса page object
    public MainPage(WebDriver driver) {
        this.driver = driver; // Инициализировали в нём поле driver
    }
    // страница
    private final String URL ="https://qa-scooter.praktikum-services.ru/";

    // Кнопка "Заказать" №1 в шапке
    private final By makeOrderTop = By.cssSelector(".Button_Button__ra12g");
    // Кнопка "Заказать" №2 в блоке "Как это работат"
    private final By makeOrderBot = By.cssSelector(".Home_FinishButton__1_cWm");

    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    //Вопрос о важном 1
    private final By firstImportantQuestion = By.id("accordion__heading-0");
    //Ответ о важном 1
    private final By firstImportantAnswer = By.id("accordion__panel-0");

    //Вопрос о важном 2
    private final By secondImportantQuestion = By.id("accordion__heading-1");
    //Ответ о важном 2
    private final By secondImportantAnswer = By.id("accordion__panel-1");

    //Вопрос о важном 3
    private final By thirdImportantQuestion = By.id("accordion__heading-2");
    //Ответ о важном 3
    private final By thirdImportantAnswer = By.id("accordion__panel-2");

    //Вопрос о важном 4
    private final By fourthImportantQuestion = By.id("accordion__heading-3");
    //Ответ о важном 4
    private final By fourthImportantAnswer = By.id("accordion__panel-3");

    //Вопрос о важном 5
    private final By fifthImportantQuestion = By.id("accordion__heading-4");
    //Ответ о важном 5
    private final By fifthImportantAnswer = By.id("accordion__panel-4");

    //Вопрос о важном 6
    private final By sixthImportantQuestion = By.id("accordion__heading-5");
    //Ответ о важном 6
    private final By sixthImportantAnswer = By.id("accordion__panel-5");

    //Вопрос о важном 7
    private final By seventhImportantQuestion = By.id("accordion__heading-6");
    //Ответ о важном 7
    private final By seventhImportantAnswer = By.id("accordion__panel-6");

    //Вопрос о важном 8
    private final By eighthImportantQuestion = By.id("accordion__heading-7");
    //Ответ о важном 8
    private final By eighthImportantAnswer = By.id("accordion__panel-7");

    //Открыть страницу
    public void openPage(){
        driver.get(URL);
    }

    // Метод клика по кнопке "Заказать' №1 в шапке
    public void clicOnMakeOrderTop() {
        driver.findElement(makeOrderTop).click();
    }
    // Метод клика по кнопке "Заказать' №2 в шапке
        public void clicOnMakeOrderBot() {
            driver.findElement(makeOrderBot).click();
    }
    //Нажать на куку чтобы не мешала
    public void clicOnCookieButton() {
        driver.findElement(cookieButton).click();
    }

    //Клик по кнопке вопросу №1
    public void clicFirstImportantQuestion() {
        driver.findElement(firstImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №1
    public void checkAreaStatusFirstImportantQuestion() {
        driver.findElement(firstImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №2
    public void clicSecondImportantQuestion() {
        driver.findElement(secondImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №2
    public void checkAreaStatusSecondImportantQuestion() {
        driver.findElement(secondImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №3
    public void clicThirdImportantQuestion() {
        driver.findElement(thirdImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №3
    public void checkAreaStatusThirdImportantQuestion() {
        driver.findElement(thirdImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №4
    public void clicFourthImportantQuestion() {
        driver.findElement(fourthImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №4
    public void checkAreaStatusFourthImportantQuestion() {
        driver.findElement(fourthImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №5
    public void clicFifthImportantQuestion() {
        driver.findElement(fifthImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №5
    public void checkAreaStatusFifthImportantQuestion() {
        driver.findElement(fifthImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №6
    public void clicSixthImportantQuestion() {
        driver.findElement(sixthImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №6
    public void checkAreaStatusSixthImportantQuestion() {
        driver.findElement(sixthImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №7
    public void clicSeventhImportantQuestion() {
        driver.findElement(seventhImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №7
    public void checkAreaStatusSeventhImportantQuestion() {
        driver.findElement(seventhImportantQuestion).getAttribute("aria-disabled");
    }

    //Клик по кнопке вопросу №8
    public void clicEighthImportantQuestion() {
        driver.findElement(eighthImportantQuestion).click();
    }
    //Проверка раскрытия ответа вопроса №8
    public void checkAreaStatusEighthImportantQuestion() {
        driver.findElement(eighthImportantQuestion).getAttribute("aria-disabled");
    }

}
