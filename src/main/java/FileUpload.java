import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload {
    WebDriver driver;
    public FileUpload(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "File Upload")
    private WebElement fileUploadBtn;
    @FindBy(id = "file-upload")
    private WebElement chooseFileField;
    @FindBy(id = "upload-btn")
    private WebElement uploadBtn;
    @FindBy(xpath = "(//div[@class='wpcf7-response-output'])[1]")
    private WebElement uploadSuccessMsg;

    public void clickFileUploadBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileUploadBtn);
        fileUploadBtn.click();
    }
    public void chooseFile(String file){
        chooseFileField.sendKeys(file);
    }
    public void upload(){
        uploadBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(uploadSuccessMsg));
    }
    public String getSuccessMsg(){
        return uploadSuccessMsg.getText();
    }
}
