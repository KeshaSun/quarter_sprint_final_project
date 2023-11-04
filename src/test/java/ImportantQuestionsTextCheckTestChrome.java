import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeOptions;
@RunWith(Parameterized.class)
public class ImportantQuestionsTextCheckTestChrome {
    private WebDriver driver;
    private final String firstQuestionText;
    private final String secondQuestionText;
    private final String thirdQuestionText;
    private final String fourthQuestionText;
    private final String fifthQuestionText;
    private final String sixthQuestionText;
    private final String seventhQuestionText;
    private final String eighthQuestionText;

    public ImportantQuestionsTextCheckTestChrome(
            String firstQuestionText,
            String secondQuestionText,
            String thirdQuestionText,
            String fourthQuestionText,
            String fifthQuestionText,
            String sixthQuestionText,
            String seventhQuestionText,
            String eighthQuestionText
    )
    {
        this.firstQuestionText = firstQuestionText;
        this.secondQuestionText = secondQuestionText;
        this.thirdQuestionText = thirdQuestionText;
        this.fourthQuestionText = fourthQuestionText;
        this.fifthQuestionText = fifthQuestionText;
        this.sixthQuestionText = sixthQuestionText;
        this.seventhQuestionText = seventhQuestionText;
        this.eighthQuestionText = eighthQuestionText;
    }
    @Parameterized.Parameters

    public static Object[][] getSumData() {
        return new Object[][] {
                {       "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                        "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                        "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30",
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                        "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                        "Да, обязательно. Всем самокатов! И Москве, и Московской области."
                },
        };
    }
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
    }

    @Test
    public void ImportantQuestionsTextCheck() {
        MainPage objMainPage = new MainPage(driver);


    }







}
