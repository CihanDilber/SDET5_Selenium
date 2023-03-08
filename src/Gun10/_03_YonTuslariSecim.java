package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {

            @Test
            public void Test1()
    {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions actions=new Actions(driver);

        // elemente git, icine tiklat, b tusuna bas

        Action action=actions
                .moveToElement(textBox)   // elementin
                .click()
                .sendKeys("b")
                .build();

        action.perform();

        MyFunc.Bekle(2);

        Action action2=actions     // burada yeniden action olusmadan da olabilir   // action=actions   olarak
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)   // click tusunun actions kullanilarak yapilani
                .build();

        action2.perform();

        BekleKapat();


    }

}
