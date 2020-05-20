package argosFunctionality;

import argosFunctionality.page_object.HeaderPage;
import argosFunctionality.page_object.ResultPage;
import org.junit.Assert;
import org.junit.Test;

public class SmokeTest extends Hooks {

    HeaderPage headerPage = new HeaderPage();
    ResultPage resultPage = new ResultPage();

//    @Test
//    public void categoryTest (){
//        headerPage.navigationByCategory("Television");
//    }
//
//    @Test
//    public void getTheProductTest ( ){
//        headerPage.doSearch("Dell Laptop");
//       String actual = resultPage.productTittle();
//       boolean condition = actual.equalsIgnoreCase("Dell Laptop");
//        Assert.assertTrue(condition);
//        Assert.assertEquals("Dell Laptopm",actual);
//
//    }
}
