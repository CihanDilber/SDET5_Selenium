package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        // ID ve Name yoksa class dan nasil bulunur
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name= driver.findElement(By.className("form-textbox"));
        name.sendKeys("ismet");
        //  form-textbox validate[required]    // arada bosluk varsa 2 class var demektir. birini sececegiz .
                                               // ctrl f ile bakacagiz kac tane diye. zaten ilkini alir

        // birden fazla aynı locator a sahip eleman bulursa findElement ne yapar ?
        // cevap : ilk element i bulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));  // findElements dedigimiz icin List e attik
        System.out.println(labels.size());

        for(WebElement e : labels )
            System.out.println("e.getText() = " + e.getText());

        // aranilan eleman bulunamazsa : findElement NoSuchElement hatasi verir.
        // findElements ise(cogul olan) size i 0 olan List verir yani hata vermez.

        MyFunc.Bekle(3);
        driver.quit();
    }
}
