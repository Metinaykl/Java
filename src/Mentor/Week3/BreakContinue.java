public class BreakContinue {
    public static void main(String[] args) {

        // Break    işlemi döngüyü kırar işlemi oldugu yerdeki işlemi sonlandırır.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue    döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // Ornek - 4 - Girilen bir sayinin Asal sayi olup olmadigini bulan bir program yaziniz...
    }
}
