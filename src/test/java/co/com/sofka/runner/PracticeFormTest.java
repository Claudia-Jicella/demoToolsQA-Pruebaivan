package co.com.sofka.runner;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.PracticeFormPage;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.Gender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class PracticeFormTest extends WebUI {

    private PracticeFormModel maria;

    @BeforeEach
    public void setUp(){
        generateStudent();
        generalSetup();
    }

    @Test
    public void practiceFormTestMandatoryFields(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(maria, driver);
        practiceFormPage.fillMandatoryFields();
    }

    @AfterEach
    public void tearDown(){
        quiteDriver();
    }

    private void generateStudent(){
        maria = new PracticeFormModel();
        maria.setName("María");
        maria.setLastaName("Mora");
        maria.setGender(Gender.FEMALE);
        maria.setMobile("3459876512");
    }
}
