package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Sekcja4 extends BasePage {
    @FindBy(css = "[data-section]~section button")
    private WebElement button;

    @FindBy(css = "img")
    private WebElement picture;

    public void waitAndClickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    public boolean isPictureDisplayed(){
        return picture.isDisplayed();
    }


    public Sekcja4(WebDriver driver) {
        super(driver);
    }
}
