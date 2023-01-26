package Gun30.Ornek2;

public class Student {

    int id;
    String fullName;
    static int sayac=1; // sen bitanesin
    // static olmadan her zaman 0 la başlıyor
    //static olduğunda artık 1 tane olduğundan
    // değerini koruyor ve hep 1 tane artıyor
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }// ilk 3 satır için yapıldı
    // staticten değişkenden sonra gerek kalmadı

    public Student(String fullName) {
        this.id=sayac++; // önce var olan değer veriliyor sonra artıyor
        this.fullName = fullName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
