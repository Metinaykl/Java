package Gun37._01_Soru;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TeslaCar t=new TeslaCar(3000,"Model 5");
        ToyotaPrius tp=new ToyotaPrius(1500,"Sedan");
        BusDiesel bd=new BusDiesel(5000,"Mercedes");

        ArrayList<Vehicle>list=new ArrayList<>(Arrays.asList(t,tp,bd));
        for (Vehicle a:list ){
            System.out.println("-------------------------------");
            System.out.println(a.getClass().getSimpleName()); // class ın adını verir
            System.out.println("-------------------------------");
            System.out.println("a.getModel = " + a.getModel());
            System.out.println("a.getEngine() = " + a.getEngine());

            if (a instanceof TeslaCar){
                System.out.println(((TeslaCar)a).drive());
                System.out.println(((TeslaCar)a).changeBattery());
            }
            else
            if (a instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius)a).drive());
                System.out.println(((ToyotaPrius)a).changeBattery());
                System.out.println(((ToyotaPrius)a).changeOil());
            }
            else
            if (a instanceof BusDiesel){
                System.out.println(((BusDiesel)a).drive());
                System.out.println(((BusDiesel)a).changeDeisel());
            }

        }


    }
}
