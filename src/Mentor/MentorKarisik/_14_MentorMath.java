package Gun15;

import java.util.Scanner;

public class _14_MentorMath {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi=oku.nextInt();

        int fact=1;
        int i=1;
        while (i<=sayi){
            fact=fact*i;
            i++;
        }
        System.out.println("fact = " + fact);
    }
}
