package Gun36._05_Ornek;

public class Test implements IGosterir,IYazdirir {
    @Override
    public void goster() {
        System.out.println("Gösterdi");

    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);

    }

    @Override
    public void yaz() {
        System.out.println("yazdırdı");

    }
}
