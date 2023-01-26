package Gun29._02_PrivateErisimleri;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="ismet";
        cal1.surname="Temur";
        //cal1.password="1234";
        cal1.SifreAta("1234");
        cal1.SifreAta("M123_sdf23");
        cal1.SifreGoster();

    }
}
