import SberbankPO.HomePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;


public class Test extends TestBase{

    @org.junit.jupiter.api.Test


    public void test1() {

        HomePage sber = new HomePage(driver);

        sber.openPage();
        sber.collectMenu();

    }

}
