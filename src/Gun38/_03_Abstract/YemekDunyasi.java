package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b = new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        CheeseCake c = new CheeseCake();
        c.setName("Cheese Cake");
        c.madeIn();
        c.taste();

        GreekSalad gr=new GreekSalad();
        gr.setName("GreekSalad");
        gr.madeIn();
        gr.taste();

        SezarSalad sl=new SezarSalad();
        sl.setName("SezarSalad");
        sl.madeIn();
        sl.taste();

    }
        }

