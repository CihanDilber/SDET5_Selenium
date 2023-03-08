package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        clickMe3.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("beklenen yazi gorundu mu?",txtActual.getText().contains("ismet"));


        BekleKapat();


    }

}
