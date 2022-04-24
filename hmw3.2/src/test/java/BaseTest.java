import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class BaseTest {
    private WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        /*FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), firefoxOptions);*/
        driver.manage().window().maximize();

        driver.get("https://barry.am/");
        mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*@AfterClass
    public void quitDriver(){driver.quit();}*/
}
