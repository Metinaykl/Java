package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;


    Ogrenci(int id,String ad,String soyad,int sinifi){
        this.id=id; // this.id : classın idsi, id: local değişken parametresi
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;

    }

    Ogrenci(){  // yapıcı metodlar :Constructor metod
        System.out.println("Nesne oluşturuldu");
    } // nesne oluşturulurken yapmak istediklerin için burayı kullan

    Ogrenci(int id,String ad,String soyad){
        this(id,ad,soyad,0); // this öğrencinin kendisi

        // this.id=id;
        // this.ad=ad;
        // this.soyad=soyad;
        // this.sinifi=0;
    }

         // mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
         // buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
         // yapıldığı metos ise Constructor yani yapıcı metodlar

}
