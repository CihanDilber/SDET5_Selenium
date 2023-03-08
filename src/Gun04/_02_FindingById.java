package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));  // elemani ID ile bul  // ID burada locater
        isimKutusu.sendKeys("ismet");  // kutucuklara yazi gonderme

        WebElement soyIsimKutusu=driver.findElement(By.id("last_8"));
        soyIsimKutusu.sendKeys("temur");  // kutucuklara yazi gonderme sendKeys ile

        MyFunc.Bekle(2);
       // isimKutusu.clear();      // silme    // submit calissin diye bunlari gecici kapattik
       // soyIsimKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde arama kutusunu acar
        // inspect bolumu aktifken arama kutusunu acar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());  // yazi alma islemi get text ile

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();  // butona tiklatma




        MyFunc.Bekle(5);
        driver.quit();
    }
}
