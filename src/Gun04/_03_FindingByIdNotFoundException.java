package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        // locaterlari dogru vermezsek ne olur?
        try {
            WebElement labelFirstName = driver.findElement(By.id("hatali locater"));  // olmayan locater ariyoruz // NoSuchElementException verir
            //System.out.println("labelFirstName.getText() = " + labelFirstName.getText());
        } catch (Exception ex) {

            System.out.println("web element bulunamadi " +ex.getMessage());  // istedigimiz mesaji vermek icin try catch yaptik
        }

        MyFunc.Bekle(3);
        driver.quit();

    }
}
