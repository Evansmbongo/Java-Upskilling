import dataProvider.FormPageData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;

public class FormPageTest extends BaseTest{
    @Test(dataProvider = "formFieldData", dataProviderClass = FormPageData.class)
    public void testFormPage(String name, String email, String message){
        FormFields formFields = page(FormFields.class);
        formFields.formFieldsBtn();
        formFields.name(name);
        formFields.waterCheckbox();
        formFields.redRadioButton();
        formFields.siblings();
        formFields.email(email);
        formFields.message(message);
        formFields.clickSubmitBtn();
        Assert.assertEquals(formFields.getAlertText(), "Message received!", "Message does not match" );
        formFields.acceptAlert();
    }
}
