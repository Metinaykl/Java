public class ForLoops {

    public static void main(String[] args) {



        // Nested For Loops

            for (int i = 1; i <= 3; i++) {

                for (int j = 1; j <= 3; j++) {
                    System.out.println("hello = " + j);

                }
                System.out.println("word = " + i);

            }

        for (int row = 1; row <= 4; row++) {

            for (int col = row; col <= 4 ; col++) {
                System.out.print("*");
            }

            System.out.println();
        }


        //------------------- Ornekler ----------------------------------------------

        // Ornek 1 - Verilen bir String ifadeyi tersten yazdiran bir program yaziniz

        // Ornek 2 - Verilen bir String ifadenin Palindrome olup olmadigini test eden bir program yaziniz

        // Ornek - 4 - Girilen bir sayinin Asal sayi olup olmadigini bulan bir program yaziniz...
    }
}
