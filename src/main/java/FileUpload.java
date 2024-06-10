import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;

public class FileUpload {
    @FindBy(linkText = "File Upload")
    private SelenideElement fileUploadBtn;
    @FindBy(id = "file-upload")
    private SelenideElement chooseFileField;
    @FindBy(id = "upload-btn")
    private SelenideElement uploadBtn;
    @FindBy(xpath = "(//div[@class='wpcf7-response-output'])[1]")
    private SelenideElement uploadSuccessMsg;

    public void clickFileUploadBtn(){
        fileUploadBtn.click();
    }
    public void chooseFile(String file){
        chooseFileField.val(file);
    }
    public void upload() throws InterruptedException {
        uploadBtn.click();
    }
    public String getSuccessMsg(){
        uploadSuccessMsg.shouldBe(Condition.visible);
        return uploadSuccessMsg.getText();
    }
}
