package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

public class _02_IFramelerGecis extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  // kod sirasina gore ilk yani 0. frame gectim

        //

        WebElement topic= driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Turkiye");

        driver.switchTo().defaultContent(); // ana sayfaya donmus olduk
        //driver.switchTo().parentFrame();  // ayni islemi yapar cunku bir kademe girmistim

        driver.switchTo().frame(1);  // 2. frame e gectim
        WebElement webSelect= driver.findElement(By.id("animals")); // select ile basliyor
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");

        BekleKapat();

    }
}
