package Gun29._02_PrivateErisimleri;

public class Calisan {

    int id; // default
    String name;  // default
    String surname; // default
    private String password; // sadece bulunduğu classdan erişim izni var


    public void SifreAta(String sifre) {

        if (sifre.length() < 8) {
            System.out.println("Zayıf Şifre");
        } else {
            this.password = sifre;
            System.out.println("Şifre Başarıyla Oluşturuldu");
        }
    }

    public void SifreGoster(){

        System.out.println("****"+password.substring(4));
    }
}
