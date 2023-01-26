package Gun25;

public class _01_JavaClassAndObject {
    // metodların yazıldığı yer
    public static void main(String[] args) { // başla
        // ana programın çalıştığı yer

        int sayi=5;

        Araba benimArabam=new Araba(); // Araba tür , tip adı benimArabam nesne
        benimArabam.marka="BMW";
        benimArabam.Motorhacmi=1600;
        benimArabam.renk="Beyaz";
        benimArabam.yili=2000;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.Motorhacmi = " + benimArabam.Motorhacmi);
        System.out.println("benimArabam.marka = " + benimArabam.marka);

    } // dur
} // metodların yazıldığı yer
// class tiplerinin tanımlandığı yer
class Araba{
  String  marka;
    String renk;
          int  Motorhacmi;
    int yili;
}
