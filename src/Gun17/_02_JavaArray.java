package Gun17;


import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        int bosluksayisi=0;
        for (int i = 0; i <cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
                bosluksayisi++;
        }

        {
            System.out.println("kelime sayısı = "+(bosluksayisi+1));

        }
    }
}
