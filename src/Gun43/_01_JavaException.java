package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("Program Çalışmaya başladı");
        String kelime=""; // önce ; koymadık compile error
        char harf=kelime.charAt(3); //  bu satırı en son ekledik , bu RUNTİME Error
        System.out.println("Program Bitti");


    }
}
// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.
