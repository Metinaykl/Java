package Gun06;
import java.util.Scanner;
public class _02_StringLength {
    public static void main(String[] args) {

        Scanner okuStr=new Scanner(System.in);  // String okumalarını yap
        Scanner okuInt=new Scanner(System.in); // int okumalarını için

        System.out.print("Cadde=");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak=");
        String sokak=okuStr.nextLine();  //"050565685855"  "545454512187888"

        System.out.print("Posta Kodu=");
        int postaKodu=okuInt.nextInt();

        System.out.print("Ulke=");
        String ulke=okuStr.nextLine();

        System.out.println("Adres="+cadde+" "+sokak+" "+postaKodu+" "+ulke);
    }
}
// String yani kelime işlemleri, çok kullanılan işlemler
// 0 216 2563258, stringler bölünmesi, istenilen kısmın alınması,
// uzunluğu,    ** 4566 , Ismet Temur -> I.T.

