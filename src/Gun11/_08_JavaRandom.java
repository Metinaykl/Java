package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math random () : double  sayi üretir.0-0,99999999 arası sayi verir

        double randSayi=Math.random();
        System.out.println("randSayi = " + randSayi);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0 -5,9999999
        // int cevirirsem 0-5;

        int RndmTamSayi=(int) (Math.random()*6);
        System.out.println("RndmTamSayi = " + RndmTamSayi);
    }
}
