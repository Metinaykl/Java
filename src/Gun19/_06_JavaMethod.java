package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
merhabaYaz(); //Math.random();
merhabayazIsme("İsmet"); // Math.Abs(-10)
        cokmerhabayaz(5);
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
    }
    public static void merhabayazIsme(String isim){
        System.out.println(isim+"merhaba");
    }
    public static void cokmerhabayaz(int miktar){
        for (int i = 0; i <miktar ; i++) {
            System.out.println("Merhaba");

        }
    }
}
