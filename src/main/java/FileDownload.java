import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class FileDownload {
    WebDriver driver;
    public FileDownload(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "File Download")
    private WebElement fileDownloadBtn;
    @FindBy(xpath = "(//a[@class='wpdm-download-link download-on-click btn btn-primary '])[1]")
    private WebElement downloadBtn;

    public void clickFileDownloadBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileDownloadBtn);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(fileDownloadBtn));
        fileDownloadBtn.click();
    }
    public void clickDownloadBtn() throws InterruptedException {
        downloadBtn.click();

        // Waiting for file to be downloaded
        Thread.sleep(5000);
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
