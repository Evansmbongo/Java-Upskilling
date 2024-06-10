import com.codeborne.selenide.Configuration;
import dataProvider.FileUploadData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class FileUploadTest extends BaseTest{
    @Test(dataProvider = "filePath", dataProviderClass = FileUploadData.class)
    public void testFileUpload(String filePath) throws InterruptedException {
        FileUpload fileUpload = page(FileUpload.class);
        fileUpload.clickFileUploadBtn();
        fileUpload.chooseFile(filePath);
        fileUpload.upload();
        Assert.assertTrue(fileUpload.getSuccessMsg().contains("Thank you for your message. It has been sent."));
    }
}
