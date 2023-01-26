package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdırınız

        int sayac=0;
        while (sayac<5) { //iken yap  : şartı arıyoruz dönme şartı

            // her döndükçe yazar
            System.out.println(sayac + ".Merhaba");

            sayac++;
        }

            System.out.println("Program Bitti");
        }
    }
