package Gun26._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int ayliktuketim){
        toplamTuketim0+=ayliktuketim;


    }
    public void ToplamTuketim(){
        System.out.println("toplamTuketim0 = " + toplamTuketim0);

    }
    public void faturaYaz(String isim){
        fatura=toplamTuketim0*birimFiyat;
        System.out.println("*************");
        System.out.println("Faturanız");
        System.out.println("*************");
        System.out.println("Müşteri"+isim);
        System.out.println("Toplam Tüketim = "+toplamTuketim0);
        System.out.println("Toplam Tutar = "+Math.round(fatura));
        System.out.println("*************");
    }
}
