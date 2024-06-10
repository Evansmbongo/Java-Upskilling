
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class FileDownload {
    @FindBy(linkText = "File Download")
    private SelenideElement fileDownloadBtn;
    @FindBy(xpath = "(//a[@class='wpdm-download-link download-on-click btn btn-primary '])[1]")
    private SelenideElement downloadBtn;

    public void clickFileDownloadBtn(){
        fileDownloadBtn.click();
    }
    public void clickDownloadBtn() {
        downloadBtn.click();

    }
    public boolean verifyDownloadedFile(){
        String downloadPath = "C:\\Users\\EvansMbongo\\Desktop\\Tests\\SeleniumAssignment\\src\\test\\Utils";
        File folder = new File(downloadPath);
        File[] listOfFiles = folder.listFiles();
        boolean isFileDownloaded = false;

//        assert listOfFiles != null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                System.out.println("File name: " + fileName);
                if (fileName.contains("test")) {
                    isFileDownloaded = true;
                }
            }
        }
        return isFileDownloaded;

    }
}
