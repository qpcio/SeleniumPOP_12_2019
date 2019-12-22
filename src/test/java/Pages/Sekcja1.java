package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sekcja1 extends BasePage{
    public Sekcja1(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#sekcja li:nth-child(3) a")
    private WebElement linkSelenium;

    public void clickSeleniumLink(){
        linkSelenium.click();
    }

    public boolean isSeleniumPageOpened(){
        return driver.getCurrentUrl().equals("https://selenium.dev/");
    }
}
