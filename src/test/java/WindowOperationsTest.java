import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowOperationsTest extends BaseTest{
    @Test(priority = 1)
    public void testNewTab() throws InterruptedException {
        WindowOperations windowOperations = new WindowOperations(driver);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickNewTabBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automatenow.io/");
    }

    @Test(priority = 2)
    public void testReplaceWindow() throws InterruptedException {
        WindowOperations windowOperations = new WindowOperations(driver);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickReplaceWindowBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automatenow.io/");
    }

    @Test(priority = 3)
    public void testNewWindow() throws InterruptedException {
        WindowOperations windowOperations = new WindowOperations(driver);
        windowOperations.clickWindowOpeartionsBtn();
        windowOperations.clickNewWindowBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automatenow.io/");
    }
}
