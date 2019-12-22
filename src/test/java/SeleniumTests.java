import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    @Test
    public void pierwszyTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
        WebElement element = driver.findElement(By.cssSelector("#sekcja li:nth-child(2)>a"));
        element.click();
        Assertions.assertEquals("https://www.google.pl/",driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void drugiTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
        WebElement element = driver.findElement(By.cssSelector("[id*='section']"));
        WebElement element2 = element.findElement(By.cssSelector("[data-row-id=\"3\"]>a"));
        element2.click();
        Assertions.assertEquals("https://selenium.dev/",driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void trzeciTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
        driver.findElement(By.cssSelector("[data-section] button")).click();

        Alert alert = driver.switchTo().alert();
        String textAlertu = alert.getText();
        System.out.println(textAlertu);
        Assertions.assertEquals("Alert Uwaga Achtung Pozor :)",textAlertu);
        alert.accept();


        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void czwartyTEst() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[data-section]+section button")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("img")).isDisplayed());


        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void piatyTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
        WebDriverWait wait = new WebDriverWait(driver,10);


         WebElement guzik = driver.findElement(By.cssSelector("[data-section]+section button"));
        wait.until(ExpectedConditions.elementToBeClickable(guzik));
        guzik.click();


        Assertions.assertTrue(driver.findElement(By.cssSelector("img")).isDisplayed());


        Thread.sleep(3000);
        driver.quit();
    }

}
