import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends BaseTest{
    @Test
    public void iframeTest(){
       Iframes iframes = new Iframes(driver);
       iframes.clickIframesBtn();
       iframes.gotoIframe();
       Assert.assertEquals(iframes.getDocPageText(), "Selenium automates browsers. That's it!", "Text does not match");
    }
}
