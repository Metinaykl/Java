package Gun38_Odev_Abstract.Soru3;

public class Samsung extends Phone{

    @Override
    void options(String a,String b) {
        if (a.equals("256") && b.equals("5,5")) {

            cart.add("$1000");

        } else if (a.equals("256")&&b.equals("7,5")) {

            cart.add("$1200");

        } else if (a.equals("512")&&b.equals("5,5")) {

            cart.add("$1300");

        } else if (a.equalsIgnoreCase("512")&&b.equalsIgnoreCase("6,5")) {

            cart.add("$1400");

        }
    }
}
