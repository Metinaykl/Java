package Gun21;

import java.util.Scanner;

public class _10_Mentor {
    public static void main(String[] args) {
        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
// Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...


        int number=0;
        int toplam=0;
        Scanner oku=new Scanner(System.in);

        for (int i = 1; i < 6 ; i++) {
            System.out.println("Sayı giriniz " +i+ " = ");
            number=oku.nextInt();
            if (number<=0.0) {
                continue;
            }
            if (number<100){
                System.out.println("Hatalı Giriş Yaptınız");
            break;
        }
            toplam+=number;

        }
        System.out.println("toplam = " + toplam);
    }
}
