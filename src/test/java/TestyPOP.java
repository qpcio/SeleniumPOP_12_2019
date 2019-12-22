import Pages.Sekcja1;
import Pages.Sekcja3;
import Pages.Sekcja4;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestyPOP extends BaseTest {
    @Test
    public void Given_When_then() {
        Sekcja1 sekcja1 = new Sekcja1(driver);
        sekcja1.clickSeleniumLink();
        Assertions.assertTrue(sekcja1.isSeleniumPageOpened(), "Nasz test nie zadziałał");
    }


    @Test
    public void test2() {
        Sekcja3 sekcja3 = new Sekcja3(driver);
        sekcja3.clickButtonAndCloseAlert();
        Assertions.assertTrue(sekcja3.getLastRow().contains("Dziwny wiersz dodawany dynamicznie"));
    }

    @Test
    public void test3() {
        Sekcja3 sekcja3 = new Sekcja3(driver);
        sekcja3.clickButtonAndCloseAlert();
        String tekst1 = sekcja3.getLastRow();
        sekcja3.clickButtonAndCloseAlert();
        Assertions.assertNotEquals(tekst1, sekcja3.getLastRow());
    }

    @Test
    public void test4() {
        Sekcja4 sekcja4 = new Sekcja4(driver);
        sekcja4.waitAndClickButton();
        Assertions.assertTrue(sekcja4.isPictureDisplayed());
    }

    @Test
    public void test5() {
        Sekcja3 sekcja3 = new Sekcja3(driver);
        sekcja3.clickButtonAndCloseAlert();
        sekcja3.clickButtonAndCloseAlert();
        sekcja3.clickButtonAndCloseAlert();
        sekcja3.clickButtonAndCloseAlert();
        int liczba = sekcja3.countTextRows();
        sekcja3.clickButtonAndCloseAlert();
        Assertions.assertTrue(liczba + 1 == sekcja3.countTextRows());
    }
}
