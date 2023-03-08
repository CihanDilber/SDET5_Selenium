package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverSoru extends BaseDriver {

    //     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1()
    {
        driver.get("https://www.etsy.com/");

        // sayfa acilinca cookie cikarsa sunu yapiyoruz ok veya accept in locater ini alarak

        //List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[class='locateri buraya yaz']
        //if(cookiesAccept.size()>0)  // varsa
        //    cookiesAccept.get(0).click();

        WebElement schmuck= driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));

        Actions actions=new Actions(driver);

        Action action=actions.moveToElement(schmuck).build();
        MyFunc.Bekle(2);  // gozukene kadar bekle diyecegiz yarin artik orjinal bekletme // bilincli bekletmek istersek kullanabiliriz tabi ki
        action.perform();


        WebElement ketten= driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));

        Action action1=actions.moveToElement(ketten).build();
        MyFunc.Bekle(2);
        action1.perform();

        WebElement bibHalsKetten= driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));
        bibHalsKetten.click();

        MyFunc.Bekle(2);  // ihtiyac beklemesi
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

       Assert.assertTrue("Url de bib kolye var mi?",driver.getCurrentUrl().contains("bib-necklaces") );   // beklentiyi yaziyorum

        BekleKapat();





    }
}
