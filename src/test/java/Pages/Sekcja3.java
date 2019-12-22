package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Sekcja3 extends BasePage {
    @FindBy(css = "[data-section] button")
    private WebElement button;

    @FindBy(css = "[data-section] .row:last-of-type")
    private WebElement lastTextRow;

    @FindBy(css = "[data-section] .row")
    private List<WebElement> allTextRows;

    public int countTextRows(){
        return allTextRows.size();
    }

    public void clickButtonAndCloseAlert(){
        button.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String getLastRow(){
        return lastTextRow.getText();
    }

    public Sekcja3(WebDriver driver) {
        super(driver);
    }



}
