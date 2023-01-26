package Gun43;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program çalışmaya başladı");

        try { // dene hatanın başladığı yerin üstüne koyulur

            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        }// hata olduğu zaman programı kırma
        catch (Exception ex){
            // ex isimli değişkene oluşan hataların bilgisi atanıyor
             // hata olduğunda yapılması istenenler buraya yazılıyor
                System.out.println("hata oluştur lütfen tekrar deneyiniz");
                System.out.println("tüm hata mesajı " + ex);
                System.out.println("hata açıklaması" + ex.getMessage());
                // kendine hata mesajını mail atabilirsin
                // log tutma : program nasıl çalışıyor ,hataları hardiske yazdırabilirsin

            }

            System.out.println("program bitti");
        try{
            // java ve toolara çalışmaya devam et
            // konuları öğrenmeye ve çalışmaya devam
            // anlamadığın yer mi oldu ? kırılmadan devam et ;
        }
        catch (Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin : DEVAM
        }

        }
    }