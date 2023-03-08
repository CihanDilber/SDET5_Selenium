package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {

    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement topic= driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Turkiye");

        driver.switchTo().frame(0); // 1. frame in icinde ki ilk frame yani index 0

        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();

        // driver.switchTo().parentFrame();    // ya bundan iki adet yapip iki kere geri gelecegiz yani en basa

        driver.switchTo().defaultContent(); // direk anasayfaya gider

        driver.switchTo().frame(1);

        WebElement webSelect= driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(webSelect);
        nesneSelect.selectByIndex(3);  // 4. eleman

        BekleKapat();




    }

}
