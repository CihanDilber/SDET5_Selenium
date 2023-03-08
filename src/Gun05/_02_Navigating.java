package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        // sayfada ileri geri yapilacaksa navigate().to kullanilir.
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement element= driver.findElement(By.id("alerttest"));
        // WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));   // bu da link text den bulma yolu
        element.click();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());  // o anda bulundugun URL bilgisini verir



        // sayfada click yapildikdan sonra geri ve ileri tusunu test etmis oluyoruz
        driver.navigate().back();  // tarayici history sinden geri geldim
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();  // tarayici history sinden ileri gittim.
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());  // o anda bulundugun URL bilgisini verir


        BekleKapat();
    }
}
