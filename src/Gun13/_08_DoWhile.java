package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String harf;

        do {
            System.out.print("harf Giriniz = ");
           harf= oku.next();
           if (!harf.equalsIgnoreCase("x"))
            System.out.println("Program Çalışıyor");


        }while (!harf.equalsIgnoreCase("x"));
        System.out.println("Program Bitti");



    }
}
