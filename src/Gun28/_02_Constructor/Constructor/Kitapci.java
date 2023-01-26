package Gun28._02_.Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        Book bk2=new Book();
        bk2.name="Harry Potter";
        bk2.publishYear=2012;
        bk2.author="JK Rowling";
        Book bk=new Book("Yüzükler",2012,"JRR Tolkien");
        Book bk3=new Book("üzüm ve Çay",2000);

        System.out.println("bk2 = " + bk2);
        System.out.println("bk = " + bk);
        System.out.println("bk3 = " + bk3);


    }
}
