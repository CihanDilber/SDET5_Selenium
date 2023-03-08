package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_iFrameGiris extends BaseDriver {

    // inspect icin sag tik yaptigimizda acilan pencerede view i frame cikar oradan anlayabiliriz iframe oldugunu
    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        // id=frame1    name=iamframe     index?: bulundugu sayfadaki kod sirasi
        driver.switchTo().frame(0);  // name veya id oldukca yavas calisir. Indeks en hizli calisani   // indeks>name>id
                                     // name ve id yukarida yaziyor
        WebElement topic= driver.findElement(By.cssSelector("b[id='topic']+input"));  // iframe girmeden once calismadi burasi
        topic.sendKeys("Turkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        BekleKapat();
    }
}
