package co.com.sofka.page;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.common.CommonActionOnpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage {

    private final PracticeFormModel practiceFormModel;

    private WebDriver webDriver;

    //For input test cases.
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By genderMale = By.id("gender-radio-1");
    private final By genderFemale= By.id("gender-radio-2");
    private final By genderOther = By.id("gender-radio-3");
    private final By mobile = By.id("userNumber");
    private final By submitButton = By.id("submit");

    //FUnciones

    public PracticeFormPage(PracticeFormModel practiceFormModel, WebDriver webDriver) {
        this.practiceFormModel = practiceFormModel;
        this.webDriver = webDriver;
    }

    public void fillMandatoryFields(){
        CommonActionOnpages commonActionOnpages = new CommonActionOnpages(webDriver);

        commonActionOnpages.clearText(name);
        commonActionOnpages.typeInto(name, practiceFormModel.getName());

        commonActionOnpages.clearText(lastName);
        commonActionOnpages.typeInto(lastName, practiceFormModel.getLastaName());

        switch (practiceFormModel.getGender()){
            case FEMALE:
                commonActionOnpages.click(genderFemale);
            case MALE:
                commonActionOnpages.click(genderMale);
            case OTHER:
                commonActionOnpages.click(genderOther);
            default:
        }

        commonActionOnpages.clearText(mobile);
        commonActionOnpages.typeInto(mobile, practiceFormModel.getMobile());

        commonActionOnpages.click(submitButton);
    }

}
