package Gun15;

import java.util.Scanner;

public class _09_MentorString {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Ülke Adı Giriniz = ");
        String ulke=oku.nextLine();
        String ulke2="";
        for (int i = ulke.length(); i <=0; i--)
        {
            ulke2=ulke.substring(i);
            System.out.println("ulke2 = " + ulke2);
        }
    }
}