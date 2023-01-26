package Gun12;

import java.util.Scanner;

public class _03_IfElseIF {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print(" Ders ve Notunuzu Giriniz = ");
        String dersvenot=oku.nextLine();

        int ind=dersvenot.indexOf(":");
        int ogrnot= Integer.parseInt(dersvenot.substring(ind+1));

        //int ogrnot2= Integer.parseInt (dersveNot.replaceAll("[^0-9]","") ); //0-9 dışındakileri siler

        if (ogrnot>=90)
            System.out.println("A");
        else if (ogrnot>=80)
            System.out.println("B");
        else if (ogrnot>=70)
            System.out.println("C");
        else if (ogrnot>=60)
            System.out.println("D");
        else if (ogrnot>=40)
            System.out.println("E");
        else
            System.out.println("F");

        }

    }
