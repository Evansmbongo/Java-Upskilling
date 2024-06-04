import dataProvider.PopUpData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class PopUpsTest extends BaseTest{
    @Test(priority = 1)
    public void alertPopUp(){
        PopUps popUps = new PopUps(driver);
        popUps.clickPopUpsBtn();
        popUps.clickAlertBtn();
        Assert.assertEquals(popUps.getAlertText(), "Hi there, pal!", "Alert does not match");
        popUps.acceptAlert();
    }
    @Test(priority = 2)
    public void confirmPopUp(){
        PopUps popUps = new PopUps(driver);
        popUps.clickPopUpsBtn();
        popUps.clickConfirmBtn();
        Assert.assertEquals(popUps.getConfirmText(), "OK or Cancel, which will it be?", "Confirm does not match");
        popUps.confirm();
    }
    @Test(priority = 3, dataProvider = "promptData", dataProviderClass = PopUpData.class)
    public void promptPopUp(String name){
        PopUps popUps = new PopUps(driver);
        popUps.clickPopUpsBtn();
        popUps.clickPromptBtn();
        Assert.assertEquals(popUps.getPromptText(), "Hi there, what's your name?", "Prompt does not match");
        popUps.setPromptText(name);
        popUps.acceptPrompt();
    }
}