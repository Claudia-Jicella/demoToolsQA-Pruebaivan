package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActionOnpages {

    private WebDriver driver;

    public CommonActionOnpages(WebDriver driver) {
        this.driver = driver;
    }

    public void typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    public void clearText(By locator){
        driver.findElement(locator).clear();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

}
