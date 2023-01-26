package Gun28._04_Constructor;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {

        Banka bnk=new Banka();
        bnk.adi="İş bankası";
        bnk.subeSayisi=50;
        bnk.kurulusYili=1923;
        System.out.println("bnk = " + bnk);

        Banka bnk2=new Banka("akbank",15);
        System.out.println("bnk2 = " + bnk2);

        Banka bnk3=new Banka("halkbank",25,1953);
        System.out.println("bnk3 = " + bnk3);



    }
}
