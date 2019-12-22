import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        /*Tu ma nie byc WebDriver */ driver = new ChromeDriver();
        driver.get("http://swiatroweru.com.pl/warsztat/seminariumStronka/");
    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("I buba");
        } finally {
            driver.quit();
        }

    }

}
