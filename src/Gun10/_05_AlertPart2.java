package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        MyFunc.Bekle(2);
        clickMe2.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().dismiss(); // kapat veya cancel icin dismiss de

        BekleKapat();


    }

}
