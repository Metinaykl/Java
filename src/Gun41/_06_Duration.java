package Gun41;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {

        // Duration hem localTime hem de LocalDateTime arasındaki farkı verir


        // LocalTime
        LocalTime dersbaslangic=LocalTime.of(19,0,0);
        LocalTime dersbitis=LocalTime.of(22,0,0);

        Duration gunlukdersSaati=Duration.between(dersbaslangic,dersbitis);
        System.out.println("gunlukdersSaati = " + gunlukdersSaati);

        System.out.println("gunlukdersSaati.toHours() = " + gunlukdersSaati.toHours()); // farkın toplam saat hali
        System.out.println("gunlukdersSaati.toMinutes() = " + gunlukdersSaati.toMinutes()); // farkın toplam dakika hali
        System.out.println("gunlukdersSaati.toMillis() = " + gunlukdersSaati.toMillis()); // farkın toplam milisaniye hali

        // LocalDateTime *** 2 Tarih- Saat arasındaki fark ***
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now(); // bugun
        Duration farkzaman=Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);
        System.out.println("farkzaman.toDays() = " + farkzaman.toDays()); // farkın toplam günü
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours()); // farkın toplam saati
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes()); // farkın toplam dakikası

    }
}
