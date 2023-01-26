package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Karabaş");
        // kopek1.ses(); // havladi
        // kopek1.kokladi(); // kokladi

        Kedi kedi1=new Kedi("kopuk");
        // kedi1.ses(); // miyavladi
       // kedi1.tirmaladi(); // tirmaladi

      //  kopekSesi(kopek1); // havladi
      //  kediSesi(kedi1);  // miyavladi

        hayvanSesi(kopek1);  // havladi
        hayvanSesi(kedi1);   // miyavladi
        /**************************************/
        //Referans Tipi  // nesne tipi
        Hayvan hayvan1=new Hayvan("ördek");
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");
        System.out.println("----------------------");
        hayvan1.ses(); // genel hayvan ses çıkardı
        hayvan2.ses(); // köpek hayvan ,havladi
        hayvan3.ses(); // kedi hayvan, miyavladi
        System.out.println("----------------------");

        hayvan2.ses();  // kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        ((Kopek)hayvan2).kokladi();// artık diğer metodları kullanabilirim.
        ((Kedi)hayvan3).tirmaladi(); // diğer metodları kullanabilirim
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.




    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
    public static void hayvanSesi(Hayvan hayvan){
        //buraya hem kedi hem köpek geliyor
        hayvan.ses();

        // bir class ın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında köpek mi
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi) // hayvan aslında kedi mi
            ((Kedi)hayvan).tirmaladi();
    }
}
//  aşağıda Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
