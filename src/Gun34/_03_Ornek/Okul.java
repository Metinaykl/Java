package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Metin Aykul", OgrTipi.LISE,"SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("Gurbet Aykul", OgrTipi.LISE,"SÖZ");
        IlkOgrencisi io=new IlkOgrencisi("Eymen Efe Aykul", OgrTipi.ILK,"Satranç");
        IlkOgrencisi io2=new IlkOgrencisi("Ebrar Ece Aykul", OgrTipi.ILK,"Tiyatro");

        System.out.println("lo1 = " + lo1);
        System.out.println("io2 = " + lo2);
        System.out.println("io = " + io);
        System.out.println("lo2 = " + io2);
    }
}
