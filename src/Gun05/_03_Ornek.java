package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız

        Scanner okuyucu = new Scanner(System.in); // okuma işlemini yapacak olan değişken tanımlandı
        System.out.print("adınızı ve soyadınızı giriniz="); // ekrana neyin girileceğini yazdık bilgilendirme
        String tamad = okuyucu.nextLine(); // okuma işlemi bu noktandan yapılıyor
        System.out.println("tamad = " + tamad); // verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim


    }
}
