package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("A.mesaj = " + A.mesaj); // A dan Merhaba
        B b = new B(); // constractor çalıştı
        System.out.println("A.mesaj = " + A.mesaj); // B den Merhaba
        A a2 = new A();
        System.out.println("A.mesaj = " + A.mesaj); // B den merhaba

    }
}
