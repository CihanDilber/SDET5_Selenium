package Gun06;

import Utility.BaseDriver;
import org.junit.Test;                             // JUNIT Javanin birim test kutuphanesi. eski olunca yeni nesil olan TestNG ye geciliyor.
                                                   // Testleri organize ediyor bunlar
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _02_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1()      // maini kaldirdik buradan // Junit eklendi , javanin test araci
    {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="merhaba selenium";  // bastan mesaji bu sekilde de atayabiliriz
        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg= driver.findElement(By.cssSelector("[id='display']"));

       // if(msg.getText().equals(mesajim))
       //     System.out.println("test passed");
       // else
       //     System.out.println("test failed");


        // If den kurtulduk boylece burada artik
        // Hata olursa ilk yazdigimiz mesaji verecek. olmazsa zaten tik yesil oluyor. bir sey yazmiyor.
        Assert.assertTrue("aranılan mesaj bulunamadi",msg.getText().equals(mesajim));  // beklenen expect
        // assertTrue: içindeki değer True mu ? True ise hiç bir şey yapmaz.mesaj vermez
        // değilse beklenen olmamışsa hata mesajı verir.
        //yani genel kural : Hata var ise göster

        BekleKapat();
    }
}


