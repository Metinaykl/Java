package Mentor.Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println(" Lütfen Adınızı Giriniz = ");
        String firstName=scanner.nextLine();

        System.out.println("Lütfen Soyismini Giriniz = ");
        String lastname=scanner.nextLine();

        System.out.println("Lütfen Cep Numaranızı Giriniz = ");
        int tel=scanner.nextInt();

        System.out.println("Okul no Giriniz = ");
        String girdi=scanner.nextLine();
        int okulno=scanner.nextInt();


        Student student=new Student(firstName,lastname,okulno,tel);
        System.out.println("Öğrenci"+student);
        Student student2=new Student("Metin","Aykul",123,123456);
        System.out.println("Öğrenci2"+student2);

        System.out.println("okul mevcudu"+Student.getStudentCount());
    }
}
