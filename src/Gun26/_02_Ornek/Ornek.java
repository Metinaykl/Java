package Gun26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person cal=new Person();
        cal.name="Metin";
        cal.surname="Aykul";
        cal.age=29;
        Person cal2=new Person();
        cal2.name="Kerem";
        cal2.surname="Dizdar";
        cal2.age=35;

        System.out.println("cal = " + cal.name);
        System.out.println("cal = " + cal.surname);
        System.out.println("cal = " + cal.age);

        System.out.println("cal2 = " + cal2.name);
        System.out.println("cal2 = " + cal2.surname);
        System.out.println("cal2 = " + cal2.age);

        //2.Yöntem Normal Metod
        BilgiYazdir(cal);
        BilgiYazdir(cal2);
        //3.Yöntem Metodu Class içinden çektik
        cal.BilgiYazdir();
        cal2.BilgiYazdir();

        //4.Yöntem
        System.out.println("toString Yöntemi = " + cal);
        cal.getBirthYear();
        cal.getInitials();




    }
    public static void BilgiYazdir(Person cals){
        System.out.println(cals.name);
        System.out.println(cals.surname);
        System.out.println(cals.age);

    }
}
