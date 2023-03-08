package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {

        // base driverda statik yaptigimiz icin cagirmasak ta ilk sirada gelir direk
        // ilk calistirirsan kullanilabilir  // method cagirmadik yani burada

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a"));  // sadece a tag ile baslayan tum elemanlari bul
        // verilen tag lerde ki tum elemanlari aldik

        for (WebElement e : linkler) {

            if (e.getText().isEmpty()) {     // ekranda gozukmeyen linkleri bulduk burada
                System.out.print("e.getAttribute(href) = " + e.getAttribute("href"));
                System.out.print("e.getAttribute(title) = " + e.getAttribute("title"));
                System.out.print("e.getAttribute(rel) = " + e.getAttribute("rel"));
            }


            BekleKapat();
        }
    }
}
