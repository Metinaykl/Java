package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayi isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplayın.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=0;i<5;i++)
        {
            System.out.print("Sayi Giriniz = ");
            int sayi=oku.nextInt();
            if (sayi>=6 && sayi<=10)
                continue; // çalıştığı anda kendinden sonra gelen komutları pas geçirir

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }

    }
}
