package argosFunctionality;

import argosFunctionality.driver.DriverHelper;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    private DriverHelper driverHelper = new DriverHelper();

    @Before
    public void setUP( ){
        driverHelper.openBrowser();
        driverHelper.navigateTo("https://www.argos.co.uk/");
        //driverHelper.navigateTo("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
        //driverHelper.handleCookies();
        driverHelper.maxBrowser();
        driverHelper.applyImplicitWait();
        driverHelper.sleep(3000);
    }
//    @After
//    public void tearDown ( ){
//        driverHelper.closeBrowser();
//    }
}
