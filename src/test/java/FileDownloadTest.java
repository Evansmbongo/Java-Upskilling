import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class FileDownloadTest extends BaseTest{
    @Test
    public void testFileDownload(){
        FileDownload fileDownload = page(FileDownload.class);
        fileDownload.clickFileDownloadBtn();
        fileDownload.clickDownloadBtn();
        Assert.assertTrue(fileDownload.verifyDownloadedFile(), "File does not exist");
    }

}
