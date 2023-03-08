package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));
        // element.click();

        Actions aksiyonlar=new Actions(driver);  // web sayfası aksiyonlara açıldı.

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.

        //aksiyonlar.moveToElement(element).click().build().perform();   // bu da atama olmadan direk yazma yontemi ama best practice degil

        System.out.println("aksiyon hazirlandi");

        MyFunc.Bekle(3);
        aksiyon.perform(); // aksiyonu gerçekleştir. , işleme al, uygula, icra et
        System.out.println("aksiyon gerceklesmistir");

        BekleKapat();
    }
}
