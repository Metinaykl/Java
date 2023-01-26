package Mentor.Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Encapsulation_Demo {
    public static void main(String[] args) {
        Course english=new Course("English",80);
        System.out.println("english = " + english);
        Course english2=new Course("English",35);
        Course fizik=new Course("Fizik ",55);

        School school=new School("Bilkent",new ArrayList<>(Arrays.asList(english,english2)));
        school.addCourse(fizik);

        System.out.println("school = " + school);
    }
}
