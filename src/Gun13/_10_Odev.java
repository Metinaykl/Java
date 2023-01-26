package Gun13;

import java.util.Scanner;

public class _10_Odev {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz = ");
        int sayi=oku.nextInt();

        System.out.print("Sayinin Tersten Yazılımı = ");
        while (sayi>0){
            System.out.print(sayi%10);
            sayi /=10;
        }
    }
}
