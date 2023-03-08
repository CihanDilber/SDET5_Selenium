package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        driver.switchTo().frame(8);  // name de verilebilir     name  gdpr-consent-notice

        List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All']"));
        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        /************************************/

        Robot rbt = new Robot();

        for (int i = 0; i < 21; i++) {    // 21 i manuel den tab a basarak bulduk en son enter diyecegiz window a girecegiz choose file


            //MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_TAB);  // tusa basildi yani down
            rbt.keyRelease(KeyEvent.VK_TAB);  // tus birakildi  burasi onemli yoksa bilgisayari kapat ac yaparsin

        }

        rbt.keyPress(KeyEvent.VK_ENTER);  // tusa basildi yani down
        rbt.keyRelease(KeyEvent.VK_ENTER);  // tus birakildi  burasi onemli yoksa bilgisayari kapat ac yaparsin

        // buraya kadar windows dosya bul acildi
        // asagida ki bolum dosyanin yolunu hafizaya kopyaliyor

        StringSelection dosyaYolu = new StringSelection("\"C:\\Users\\Cihan Dilber\\Desktop\\ornek.txt\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER); // dosya Entera basılarak gönderildi
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        // checkBox gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE); // çeklendi
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        // butona gelindi gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER); // enterlandı
        rbt.keyRelease(KeyEvent.VK_ENTER);



        MyFunc.Bekle(3);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement message = driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));
               // visibilityOfElementLocated(By.xpath("//center[text()='has been successfully uploaded.']")));

        Assert.assertEquals(message,"has been successfully uploaded.");
        BekleKapat();
        }

    }


