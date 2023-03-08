package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

   //     <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
   //      id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
   //      value="" fdprocessedid="nvwb9j">

        // elemanin parametrelerine ulasmak icin getAttribute u kullaniyoruz.
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        // rengini yazi buyuklugunu arka zemin rengini alabiliyoruz // class in parametreleri
        // Class in karsiligi olan CSS sekillendirme degerlerini almak icin getCssValue kullanilir
        System.out.println("getCssValue(color)= "  + inputValEnter.getCssValue("color"));
        System.out.println("getCssValue(font-size)= "  + inputValEnter.getCssValue("font-size"));
        System.out.println("getCssValue(background)= "  + inputValEnter.getCssValue("background"));




        BekleKapat();
    }
}
