package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi = ");
        System.out.println("a+b sonucu = " + (a+b));

        System.out.println("Çıkarma işlemi = ");
        System.out.println("a-b sonucu = " + (a-b));

        System.out.println("Çarpma işlemi = ");
        System.out.println("axb sonucu = " + (a*b));

        System.out.println("Bölme işlemi = ");
        System.out.println("a/b sonucu = " + ((double)a/b));
        // normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz.  çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli


        System.out.println("Bölme işlemi = ");
        System.out.println("a/b sonucu = " + (a/b));

        System.out.println("Modül işlemi = ");
        System.out.println("a%b sonucu = " + (a%b));

        System.out.println("Modül işlemi = ");
        System.out.println("b%a sonucu = " + (b%a));

        //        kısa önemli not !
        //        Modül (%)'de
        //        sol büyük ise kalanı al
        //        sol küçükse solundakini al
        //        2 sayi eşit bölünebiliyor veya aynı ise sonuç 0






    }
}
