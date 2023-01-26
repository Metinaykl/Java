package SoruCozumleri;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle = oku.nextLine();
        int sonuc = seliHarf(cumle);
        System.out.println("sonuc = " + sonuc);
    }

    public static int seliHarf(String str) {
        int miktar = 0;
        String esliHarfler = "aeiıoöuü";
        for (int i = 0; i < esliHarfler.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (esliHarfler.charAt(i) == str.charAt(j)) {
                    miktar++;
                }
            }
        }
        return miktar;
    }
}
