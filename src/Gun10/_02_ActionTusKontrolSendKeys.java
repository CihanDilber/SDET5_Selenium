package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        // element.sendKeys("Ahmet");   // normalde bu sekilde gonderilir

        // schift a yapptim sonra schift i biraktim ve hmet yazdim  --> Ahmet

        Actions actions=new Actions(driver);

        Action action=actions
                .moveToElement(element) // kutucuga gel
                .click()               // icine tiklat
                .keyDown(Keys.SHIFT)  // schift e basili tut
                .sendKeys("a")        // schift+a -> A
                .keyUp(Keys.SHIFT)    // schift i birak
                .sendKeys("hmet")     // yaziyi gonder
                .build();

        // aksiyon hazirlandi

        MyFunc.Bekle(2);
        action.perform();     // aksiyon gerceklestirildi

        BekleKapat();



    }
}
