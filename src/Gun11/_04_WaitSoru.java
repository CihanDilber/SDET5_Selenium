package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test()
    {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsung= driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        samsung.click();

        WebElement addToCart= driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());  // alert cikana kadar bekle

        driver.switchTo().alert().accept();


        WebElement productStore= driver.findElement(By.xpath("//a[@class='navbar-brand' and @ id='nava']"));
        productStore.click();

        BekleKapat();

        // alert var mi yi kontrol etmek icin bu metodu kullanabiliriz

        //        public static boolean isAlertPresent(){
//                try{
//                driver.switchTo().alert();
//                return true;
//                  }catch(NoAlertPresentException ex){
//                return false;
//            }
//        }







    }
}
