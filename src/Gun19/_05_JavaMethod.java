package Gun19;

public class _05_JavaMethod {
    // buraya metodlar yazılabilir
    public static void main(String[] args) {
        Math.max(5,6); //  bir şeyler verilmiş ,geriye değer alınıyor
        Math.random(); // veri almıyor , sadce veri veriyor

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
                merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
                merhabaYaz();// mainin daha kolay anlaşılabilir olur.
                merhabaYaz();// fonksiyonu çağırma şekli

    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }
    // buraya metodlar yazılabilir
}
