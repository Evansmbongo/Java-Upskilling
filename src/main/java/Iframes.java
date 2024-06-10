import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.switchTo;

public class Iframes {
    @FindBy(linkText = "Iframes")
    private SelenideElement iframesBtn;
    @FindBy(css = "#frame1")
    private SelenideElement iframe;
    @FindBy(css = ".d-1.fw-bold")
    private SelenideElement docPageText;

    public void clickIframesBtn(){
        iframesBtn.click();
    }
    public void gotoIframe(){
        switchTo().frame("frame1");
    }
    public String getDocPageText(){
        return docPageText.getText();
    }

}
