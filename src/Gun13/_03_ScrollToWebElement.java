package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.manage().deleteAllCookies();  // cookies leri sildik, accept her zaman ciksin diye
        driver.get("https://www.copado.com/robotic-testing");

        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);  // element e kadar kaydir
        // true ustte gosterir false altta gosterir tiklanacak elemani

        // element.click();  // tiklatma ozelligini kaybettiren elementlerin altinda oldugundan tiklanamaz

        // en garanti tiklama yolu bu
        js.executeScript("arguments[0].click();", element);  // html icinden elemente ulasir ve tiklatir

        MyFunc.Bekle(5);



        BekleKapat();

    }
}
