import dataProvider.ModalFormData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalsTest extends BaseTest{
    @Test(priority = 1)
    public void testSimplesModal(){
        Modals modals = new Modals(driver);
        modals.clickModalsBtn();
        modals.clickSimpleModalBtn();
        Assert.assertTrue(modals.getSimpleModalText().contains("Hi, I’m a simple modal."));
        modals.clickSimpleModalCloseBtn();
    }

    @Test(priority = 2, dataProvider = "modalForm", dataProviderClass = ModalFormData.class)
    public void testFormModal(String name, String email, String message){
        Modals modals = new Modals(driver);
        modals.clickModalsBtn();
        modals.clickFormModalBtn();
        modals.setFormModal(name, email, message);
    }
}
