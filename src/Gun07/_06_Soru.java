package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);
        System.out.print("adınızı ve soyadınızı yazınız = ");
        String tamad=oku.nextLine();

        //ismet temur, Ali Koç
        // ad: 0, boslugun indexine kadar
        // soyad: bosluk+1, sonuna kadar

        int boslukIndex=tamad.indexOf(" ");
        String ad=tamad.substring(0,boslukIndex);
        String soyad=tamad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}
