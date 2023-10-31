import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OrderModalFourthPlacedOrder {

    //Добавили поле driver
    private final WebDriver driver;

    //Добавили конструктор класса page object
    public OrderModalFourthPlacedOrder(WebDriver driver) {
        this.driver = driver; // Инициализировали в нём поле driver
    }
    //Надпись в моделе "Заказ оформлен"
    private final By orderPlaced = By.className("Order_ModalHeader__3FDaJ");

    //Забираем текст из модала
    public String getHeaderText() {
        return driver.findElement(orderPlaced).getText();
    }

    //Ожидание модала "Заказ оформлен"
    public void waitForLoadHeader() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(orderPlaced));
    }

}
