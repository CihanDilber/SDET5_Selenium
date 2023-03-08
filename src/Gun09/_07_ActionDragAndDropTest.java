package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement morway= driver.findElement(By.id("box101"));

        // 1. yontem
       // aksiyonlar.dragAndDrop(oslo, morway).build().perform();    // oslo yu norway e at

        // 2. yontem

        aksiyonlar.clickAndHold(oslo).build().perform();  // oslo yu tiklat ve al
        aksiyonlar.moveToElement(morway).release().build().perform();   // norway in uzerine git ve birak

        // 3. yontem - best practice olan

       // Action aksiyon=aksiyonlar.dragAndDrop(oslo,morway).build();
       // aksiyon.perform();


        BekleKapat();

    }

}
