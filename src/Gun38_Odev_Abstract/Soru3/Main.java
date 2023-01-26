package Gun38_Odev_Abstract.Soru3;

import java.util.Scanner;

import static Gun38_Odev_Abstract.Soru3.Phone.cart;

    public class Main {
        public static void main(String[] args) {



            Scanner scan=new Scanner(System.in);
            System.out.print("Aplle telefonunuzun hafızası kaç GB Olsun ? = ");
            String str1=scan.nextLine();
            System.out.print("Apple telefonunuzun ekranı kaç inch Olsun ? = ");
            String str2=scan.nextLine();
            Apple app=new Apple();
            app.options(str1,str2);



            System.out.print("Samsung telefonunuzun hafızası kaç GB Olsun ? = ");
            String str3=scan.nextLine();
            System.out.print("Samsung telefonunuzun ekranı kaç inch Olsun ? = ");
            String str4=scan.nextLine();

            Samsung smg=new Samsung();
            smg.options(str3,str4);

            int siparisToplam=Phone.getSum();
            System.out.println("Ödenecek ücret toplamda $ "+siparisToplam);
            System.out.println("Güle Güle Kullanın");

        }
    }
