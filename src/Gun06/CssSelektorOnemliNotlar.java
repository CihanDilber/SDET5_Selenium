package Gun06;

import org.openqa.selenium.By;

public class CssSelektorOnemliNotlar {

                                 //CssSelektorOnemliNotlar

  //  [id^='u_'] -> id si    u_ ile başlayan     startWith      // Bu 3 ozellik sadece cssselektor de var.
  //  [id*='u_'] -> id sinde u_ geçen            contains
  //  [id$='u_'] -> id si    u_ ile biten        endWith

/*****************************************************************************/

   //  <div>               cocukları: span, span, div  ,  tumcocukları(cocuk+torun): span, span, div, img, input

   //     <span> merhaba 1 </span>  ->cocuk
   //     <span> merhaba 2 </span>  ->cocuk

   //     <div>  -> çocuk
   //         <img src=logo.png>  -> torun
   //         <input type="text">
   //     </div>

   //  </div>
   //  <label>merhaba</label> -div in bitisik kardeşi
   //  <h2>merhaba</h2>       -div in diğer kardeşi

    //    kardeş -> bitişik kardeş demek
    //    kardeşler -> tüm kardeşleri


    /**************************************************************************/

   // div[id='user-message'] > label
   // id si user-message olan DIV in çocuklarından label olan

   // div[id='user-message'] > label + span
   // id si user-message olan DIV in çocuklarından label dan hemen sonraki span

   // div[id='user-message'] > span   yukarıdaki ile aynı

   // [id='get-input'] input         // space var burada
   // id si get-input olan elemanın bütün cocuklarındaki ilk input olan

    /****************************************************************************/

   //  >     -> cocuklarda arar
   //  space -> tüm cocuklarda(torunlar dahil) arar, tum alt elemanlarda arar yani
   //  +     -> bitişik kardeş i bulur
   //  ~     -> tüm kardeşlerde ara

    /***************************************************************************/

   // [id='user-message'] > *   cocukların hepsi(torunlar yok)

    /**************************************************************************/

   // [class='nav navbar-nav'] > li+li+li
   // [class='nav navbar-nav'] > :nth-child(3)

   // yukarıdakilerin ikiside 3.Çocuk demektir.


    /*************************************************************************/

    //  By.xpath()  //

   // cssSelector olmayan 2 hareket var

   // elemendan geri gitme
  //  ekrandan gözüken yazısı ile bulma

   //   By.Id("firstName");
  //    By.Name("firstName");
   //   By.cssSelector("[id='firstName']")

    //    By.xpath(" //[@id='firstName']   ")
    /************************************************************************/

  /*    Genel Stratejimiz
     1- ID first
     2-  CSS selector for everything else
     3-  When nothing else works, use XPath   */

}
