import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class WindowOperationsTest extends BaseTest{
    @Test(priority = 1)
    public void testNewTab() throws InterruptedException {
        WindowOperations windowOperations = page(WindowOperations.class);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickNewTabBtn();
        Assert.assertTrue(Selenide.title().contains("Home | automateNow"), "Does not contain");
    }

    @Test(priority = 2)
    public void testReplaceWindow() {
        WindowOperations windowOperations =  page(WindowOperations.class);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickReplaceWindowBtn();
        Assert.assertEquals(Selenide.title(), "Home | automateNow");
    }

    @Test(priority = 3)
    public void testNewWindow() throws InterruptedException {
        WindowOperations windowOperations =  page(WindowOperations.class);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickNewWindowBtn();
        Assert.assertEquals(Selenide.title(), "Window Operations | Practice Automation");
    }
}
