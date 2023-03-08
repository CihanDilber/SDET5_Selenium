package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class xPathOdev extends BaseDriver {


    @Test
    public void Homework(){

        driver.get("https://www.saucedemo.com/");

        MyFunc.Bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Username']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(2);
        WebElement loginButton= driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();

        MyFunc.Bekle(2);
        WebElement backpack= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        backpack.click();

        MyFunc.Bekle(2);
        WebElement addBackpack= driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addBackpack.click();

        MyFunc.Bekle(2);
        WebElement backToProducts= driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        backToProducts.click();

        MyFunc.Bekle(2);
        WebElement boltTshirt= driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();

        MyFunc.Bekle(2);
        WebElement addboltTshirt= driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addboltTshirt.click();

        MyFunc.Bekle(2);
        WebElement goYourCart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        goYourCart.click();

        MyFunc.Bekle(2);
        WebElement checkout= driver.findElement(By.xpath("//button[text()='Checkout']"));
        checkout.click();

        MyFunc.Bekle(2);
        WebElement firsName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firsName.sendKeys("Cihan");

        MyFunc.Bekle(2);
        WebElement lastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Kabak");

        MyFunc.Bekle(2);
        WebElement zipCode= driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("4103");

        MyFunc.Bekle(2);
        WebElement continue_= driver.findElement(By.xpath("//input[@type='submit']"));
        continue_.click();

        // urun ucret toplamlarinin testi
        MyFunc.Bekle(2);
        List<WebElement> items= driver.findElements(By.xpath("//div[@class='item_pricebar']"));

        double itemTotal=0;
        for(WebElement item :items){

            String itemStr=item.getText().replace("$","");  // substring(1) de oluyor burada
            itemTotal+=Double.parseDouble(itemStr);
        }


        WebElement itemTotal_We= driver.findElement(By.xpath("//div[@class='summary_subtotal_label'] "));

        String itemTotal_We_Str=itemTotal_We.getText().replaceAll("[^0-9,.]","");

        double itemTotal_We_Double=Double.parseDouble(itemTotal_We_Str);

        Assert.assertTrue("Degerler esit degil",itemTotal==itemTotal_We_Double);



        BekleKapat();

    }
}
