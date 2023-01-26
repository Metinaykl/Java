package Gun38_Odev_Abstract.Soru3;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Phone {

     static ArrayList<String> cart = new ArrayList<>();
    abstract void options(String a,String b);


     static int getSum(){

         int sum = 0;
         for (String s : cart) {
             String duzen= s.replaceAll("[^0-9]", "");
             sum+=Integer.parseInt(duzen);

             }

         return sum;

     }

}
