package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_Soru extends BaseDriver {

    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");

        // find elements bulamazsa list in size i 0 gonderiyor hata dondurmuyor. bulamasa da hata vermez artik
        MyFunc.Bekle(2);
        List<WebElement> cookiesAllow= driver.findElements(By.xpath("//button[text()='Temel ve isteğe bağlı çerezlere izin ver']"));
        if(cookiesAllow.size() > 0)
            cookiesAllow.get(0).click();

        MyFunc.Bekle(2);
        WebElement createNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();

        MyFunc.Bekle(2);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Cihan");

        MyFunc.Bekle(2);
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Kabak");

        MyFunc.Bekle(2);
        WebElement reEmail= driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());   // beklenen gorunmemesi false yani
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("c.kabak@gmail.com");

        MyFunc.Bekle(2);
        Assert.assertTrue(email.isDisplayed());  // beklenen gorunmesi true yani
        System.out.println("email.isDisplayed() = " + email.isDisplayed());

        MyFunc.Bekle(2);
        WebElement webDay= driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("23");

        MyFunc.Bekle(2);
        WebElement webMonth= driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByValue("5");

        MyFunc.Bekle(2);
        WebElement webYear= driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1984");

        BekleKapat();




















    }
}
