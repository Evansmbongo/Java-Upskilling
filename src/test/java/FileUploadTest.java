import dataProvider.FileUploadData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{
    @Test(dataProvider = "filePath", dataProviderClass = FileUploadData.class)
    public void testFileUpload(String filePath) throws InterruptedException {
        FileUpload fileUpload = new FileUpload(driver);
        fileUpload.clickFileUploadBtn();
        fileUpload.chooseFile(filePath);
        fileUpload.upload();
        Assert.assertTrue(fileUpload.getSuccessMsg().contains("Thank you for your message. It has been sent."));
    }
}
