import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class IframeTest extends BaseTest{
    @Test
    public void iframeTest(){
       Iframes iframes = page(Iframes.class);
       iframes.clickIframesBtn();
       iframes.gotoIframe();
       Assert.assertEquals(iframes.getDocPageText(), "Selenium automates browsers. That's it!", "Text does not match");
    }
}
