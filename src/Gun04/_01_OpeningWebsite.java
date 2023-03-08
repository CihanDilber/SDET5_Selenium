package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        // 1- hepsiburada.com sayfasina git
        // 2- arama kutusuna usb yaz
        // 3- ara butonuna bas
        // 4- cikan urunlerin aciklamasinda usb kelimesini kontrol

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");  // sayfaya gittim

        //driver dan isteyecegiz asagidaki kodlari

        //        eleman aramakutusu = aramakutusunu bul;
        //        aramakutusu.yaziGonder("usb");
        //        elemanlar =  urunListesiniAl;

        //        for döngüsü ile kontrol et.


        MyFunc.Bekle(5); // kapanmadan once bekleme yaptiriyoruz burada // tekrar yazmayalim diye MyFunc i kullandik, direk Thread sleep kullanmadik
        driver.quit();  // butun acilmis tarayicilari kapatir
                        // driver.close() ise sadece acilmis sayfayi kapatir


    }
}
