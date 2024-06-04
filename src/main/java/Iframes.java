import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iframes {
    WebDriver driver;
    public Iframes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Iframes")
    private WebElement iframesBtn;
    @FindBy(css = "#frame1")
    private WebElement iframe;
    @FindBy(css = ".d-1.fw-bold")
    private WebElement docPageText;

    public void clickIframesBtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iframesBtn);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(iframesBtn));
        iframesBtn.click();
    }
    public void gotoIframe(){
        driver.switchTo().frame("frame1");
    }
    public String getDocPageText(){
        return docPageText.getText();
    }

}
