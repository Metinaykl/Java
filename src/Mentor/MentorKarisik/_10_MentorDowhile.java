package Gun15;

import java.util.Scanner;

public class _10_MentorDowhile {
    public static void main(String[] args) {
        // Örnek Soru: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
// Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

        Scanner oku=new Scanner(System.in);
        int sayac=0;
        int pin=1234;


        do {
            System.out.print("PIN Kodu GİRİNİZ = ");
            int pin2= oku.nextInt();
            sayac++;
            if (pin2==pin) {
                System.out.println("Sisteme Giriş yapıldı");
                break;
            }
                else
                System.out.println("Yanlış Pin");

        }while (sayac<3);
        System.out.println("üzgünüm Beyda Hocam Kartı Bloke Etti");
    }
}