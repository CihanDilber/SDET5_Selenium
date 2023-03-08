package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {

    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");

        String anasayfaWindowID = driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        // su anda butun sayfalar acildi, mail haric
        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        Set<String> windowsIDler = driver.getWindowHandles();

        for (String id : windowsIDler) {
            driver.switchTo().window(id);  // sirada ki tabda ki window a gecmis oldum
            System.out.println("title=" + driver.getTitle() + ", url=" + driver.getCurrentUrl());

        }

        // ana sayfa harici kapama

        for (String id : windowsIDler) {
            if(id.equals(anasayfaWindowID))  // anasayfa harici kapanma
                continue;
            MyFunc.Bekle(2);
            driver.switchTo().window(id);  // sirada ki tabda ki window a gecmis oldum
            driver.close();


        }

        BekleKapat();
    }
}