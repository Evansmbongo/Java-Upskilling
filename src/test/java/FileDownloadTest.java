import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest{
    @Test
    public void testFileDownload() throws InterruptedException {
        FileDownload fileDownload = new FileDownload(driver);
        fileDownload.clickFileDownloadBtn();
        fileDownload.clickDownloadBtn();
        Assert.assertTrue(fileDownload.verifyDownloadedFile(), "File does not exist");
    }
}
