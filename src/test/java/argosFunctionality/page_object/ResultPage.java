package argosFunctionality.page_object;

import argosFunctionality.driver.DriverHelper;
import org.openqa.selenium.By;

public class ResultPage extends DriverHelper {

    public String productTittle( ){
        return driver.findElement(By.cssSelector("")).getText();
    }
}
