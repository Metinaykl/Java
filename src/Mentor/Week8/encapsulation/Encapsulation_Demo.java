package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encapsulation_Demo {

    public static void main(String[] args) {

        Course english = new Course("English", 30);

        System.out.println("english = " + english);
        Course math = new Course("Math", 75);
        Course phsics = new Course("Phsics", 75);

        School newSchool = new School("Bilkent", new ArrayList<>(Arrays.asList(english, math)));
        newSchool.addCourse(phsics);
        System.out.println("newSchool = " + newSchool);

        School school = new School("ODTU");
        school.addCourse(english);
        System.out.println("school = " + school);

        Course german = new Course("German");
        german.setMinScore(30);
        System.out.println("german = " + german);




    }
}
