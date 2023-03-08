package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {

    // 1-Açılan sayfadaki kutucuğa mesajınızı yazınız.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
    // Css Selektor ile


    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="merhaba selenium";  // bastan mesaji bu sekilde de atayabiliriz
        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg= driver.findElement(By.cssSelector("[id='display']"));

        if(msg.getText().equals(mesajim))
            System.out.println("test passed");
        else
            System.out.println("test failed");



        BekleKapat();
    }
}
