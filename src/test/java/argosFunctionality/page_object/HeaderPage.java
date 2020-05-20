package argosFunctionality.page_object;

import argosFunctionality.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HeaderPage extends DriverHelper {



    public void doSearch (String searchItems){
        WebElement element = driver.findElement(By.xpath("//input[@id='searchTerm' and @role='combobox']"));
        sleep(3000);
        //element.sendKeys("hello");
        element.sendKeys(searchItems);
        element.sendKeys(Keys.ENTER);


        sleep(3000);
    }

//    public void navigationByCategory (String category){
//
//        Actions actions = new Actions(driver);
//        List<WebElement> elements  = driver.findElements(By.cssSelector("#megabutton1"));
//        actions.moveToElement(elements.get(0)).build().perform();
//        driver.findElement(By.linkText(category)).click();
//
//    }



}
