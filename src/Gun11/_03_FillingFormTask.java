package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

    /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz   */

    @Test
    public void Test()
    {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.cssSelector("[id='title']"));
        name.sendKeys("Cihan");

        WebElement comment= driver.findElement(By.cssSelector("[id='description']"));
        comment.sendKeys("Loading..");

        WebElement submit= driver.findElement(By.cssSelector("[id='btn-submit']"));
        submit.click();

        // bu olmaz mesela burada, elemanin locater bulma suresi ile ilgili bu
        // zaten elemanlari hemen buluyor
       //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[id='submit-control']"), "Form submited Successfully!"));

        WebElement message= driver.findElement(By.cssSelector("[id='submit-control']"));

        Assert.assertEquals("Form submited Successfully!", message.getText());  // hizli oldugu icin hata veriyor. yazi cikana kadar beklemeye ihtiyac var


        BekleKapat();







    }
}
