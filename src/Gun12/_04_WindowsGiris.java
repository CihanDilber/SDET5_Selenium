package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {

    @Test
    public void Test()
    {
        driver.get("https://www.selenium.dev/");

        // su asamada ana sayfadayim
        // bulunulan windowid yi almak icin

        String anasayfaWindowID= driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement link : linkler)
            if(!link.getAttribute("href").contains("mail"))  // mail acilmiyor boylece
                link.click();

        // su asamada butun sayfalar acildi
        Set<String> windowsIDler=driver.getWindowHandles();
        for(String id:windowsIDler)
            System.out.println("id = " + id);

        // su anda en son acilan sayfadayim. ana sayfaya gecmek icin
        driver.switchTo().window(anasayfaWindowID);  // ana sayfaya gectim

        MyFunc.Bekle(10);

        BekleKapat();


    }
}
