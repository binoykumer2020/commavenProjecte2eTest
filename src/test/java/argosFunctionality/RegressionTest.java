package argosFunctionality;

import argosFunctionality.page_object.HeaderPage;
import org.junit.Test;

public class RegressionTest extends Hooks {

        HeaderPage headerPage = new HeaderPage();

        @Test
        public void searchTest (){
            headerPage.doSearch("nike");
        }


}
