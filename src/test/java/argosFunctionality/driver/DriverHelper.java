package argosFunctionality.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public WebDriver driver;
    private String browser = "google";

    public void openBrowser( ){
        switch (browser){
            case "google":
                ChromeDriverManager.getInstance().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                FirefoxDriverManager.getInstance().setup();
                driver= new FirefoxDriver();
                break;
        }
    }

    public void navigateTo (String url){
        driver.get(url);
    }

    public void maxBrowser ( ){
        driver.manage().window().maximize();
    }
    public void applyImplicitWait ( ){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    /*public void handleCookies ( ){
        driver.findElement(By.xpath("//a[contains(text(),'Got it')]")).click();
    }*/

    public void sleep (int ms){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
//    public void closeBrowser () {
//        driver.quit();
//    }

}
