package Gun36._04_Ornek;
// 1 class 1 den fazla Interface Implemente edebilir
public class A4 implements IGosterir,IYazdirir {
    // hem karasal hem uydu
    @Override
    public void Goster() {
        System.out.println("Gösterildi");

    }

    @Override
    public void Yazdir() {
        System.out.println("Yazdirildi");

    }
}
