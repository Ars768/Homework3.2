import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebElement news_image;
    private WebElement menuItem;
    private By newsImageField = By.cssSelector(Constants.newsImageLoc);
    private By menuItemField = By.cssSelector(Constants.menuItemLoc);

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public HomeMedEquipmentPage goToHomeMedEquipmentPage(){
        news_image = driver.findElement(newsImageField);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(news_image));

        driver.findElement(menuItemField).click();
        HomeMedEquipmentPage newPage = new HomeMedEquipmentPage(driver);
        return newPage;
    }

    public WebElement news_photos(){
        news_image = driver.findElement(newsImageField);
        return news_image;
    }
}
