package Gun30.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"ismet temur");
        Student ogr2=new Student(1,"mehmet yılmaz");
        Student ogr3=new Student(1,"beyza demir");

        // problem hem id yi takip etmek zorundayız
        // hemde hata olasılığı yüksek

        Student ogr10=new Student("ismet temur");
        Student ogr11=new Student("mehmet yılmaz");
        Student ogr12=new Student("beyda demir");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);

    }
}
