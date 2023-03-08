package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.(tiklayin)
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector ile yapacagiz

    @Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(2);
        WebElement business= driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(2);
        WebElement dropDownDiscover= driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        MyFunc.Bekle(2);
        WebElement optionOnlineAdvertising= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.Bekle(2);
        WebElement buttonEveryDay= driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        MyFunc.Bekle(2);
        WebElement goodRadio= driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        MyFunc.Bekle(2);
        WebElement secenek4= driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();

        goodRadio.click();



        BekleKapat();



    }

}
