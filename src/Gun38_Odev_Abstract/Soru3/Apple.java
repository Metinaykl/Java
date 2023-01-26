package Gun38_Odev_Abstract.Soru3;

public class Apple extends Phone{


    @Override
    void options(String a,String b) {

        if (a.equals("64") && b.equals("5,5")) {

            cart.add("$750");

        } else if (a.equals("64")&&b.equals("6,5")) {

            cart.add("$850");
            
        } else if (a.equals("128")&&b.equals("5,5")) {

            cart.add("$950");
            
        } else if (a.equals("128")&&b.equals("6,5")) {

            cart.add("$1200");
            
        }

    }
}
