package Gun14;

import Utility.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("ismet");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // hata var ise cikan element
        List<WebElement> hataMesaji=driver.findElements(By.cssSelector("div[role='alert'"));

        if(hataMesaji.size()>0){
            System.out.println("hata olustu");

            TakesScreenshot ts=(TakesScreenshot) driver;   // 1. asama ekran goruntusu alma degiskenini tanimladim
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);  // 2. asama ekranin goruntusu alindi ve hafizada su anda
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png"));  // burasi yolu. nere istersen onu yaz
            // hafizadaki bu bilgiyi dosya olarak kaydet


        }

        BekleKapat();

        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
        //        bunu nasıl yaparsınız
        //        LocalDateTime alıcaksın bilgileri
        //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png




    }
}
