package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        //kullanıcıdan girilen gün numarasına karşılık gelen günün adını yazınız


        Scanner oku=new Scanner(System.in);
        System.out.print("Gün no = ");
        int gunno=oku.nextInt();

        // if (gunno==1)
        //System.out.println("Pazartesi");
        // if (gunno==2)
        //System.out.println("Salı");
        // ..........

        switch (gunno) {
            case 1: System.out.println("Pazartesi");break; //switchden çık işlem yap çık
            case 2: System.out.println("Salı");break;
            case 3: System.out.println("Çarşamba");break;
            case 4: System.out.println("Perşembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
            default: System.out.println("Hatalı Giriş yaptınız"); //case dekilerin dışında ise

                //iflerde tek değer olması durumunda ,2 den fazla if kullanman gerekiyorsa
                //switch kullan diğer durumlarda if.
        }
        }
    }
