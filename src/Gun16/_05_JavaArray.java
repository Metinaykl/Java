package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanal1={"trt","atv","kanald","fox","habertürk"}; // 01234
        int rastgele=(int) (Math.random()* kanal1.length); // 5 kadar dahil değil
        System.out.println(" Rastgele Secilen Kanal =  " +kanal1[rastgele]);

        // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
        //  fakat bir buldunu tekrar bulmasın

    }
}
