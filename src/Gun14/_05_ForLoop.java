package Gun14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();
        int carp = 1;
        for (int i = 1; i <= sayi; i++) {
            carp = carp * i;
            if (carp >= 10000) {
                System.out.println("İşlem Sonlandı");
                break;

            }
        }
            System.out.println("Çarpma İşlem Sonucu = " + carp);
        }

    }
