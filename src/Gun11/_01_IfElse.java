package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi=oku.nextInt();

        if (sayi>0){
            System.out.println("Pozitif");}
        else {
        if (sayi<0)
            System.out.println("Negatif");
        else
            System.out.println("Sıfır");}



    }
}
