package Gun15;

public class _11_MentorWhile {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) toplam = toplam + i;
            toplam++;
        }

        System.out.println("Çift sayılar toplamı = " + toplam);
        {
            for (int s = 0; s < 100; s++) {
                if (s % 2 == 1) toplam = toplam + s;
                toplam++;

            }
            System.out.println("Tek sayılar Toplamı = " + toplam);


        }


    }
}
