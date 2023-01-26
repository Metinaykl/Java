package Gun30._02_FinalVaribles.Ornek1;

public class Vatandas {

    String isim;
    final int tcNo; // değiştirilemez yani 1 kere veri atama şansı var
    static int tcNosayac =1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNosayac++;
        // final değişkenlerine sadece 1 kez veri atanabilir
        // o da ya tanımlanırken, yada Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
