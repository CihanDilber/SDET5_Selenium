package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        // LinkText ile bulma, sadece a tag lerde tiklamalilarda kullanilir
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));  // tam gorunen link text ini verecegiz
        // gozuken text i Siparislerim olan a tag li web element
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());  // elemana ulasabildik mi diye yazdiriyoruz

        System.out.println("siparislerimLinki.getAttribute(href) = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(title) = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(rel) = " + siparislerimLinki.getAttribute("rel"));

        // partialLinkText , sadece a tag ler icin kullanilir

        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat")); // gorunen link text inin bir parcasi verilebiliyor
        System.out.println("link2.getText() = " + link2.getText());



        MyFunc.Bekle(3);
        driver.quit();
    }
}
