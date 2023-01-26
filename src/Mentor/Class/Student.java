package Mentor.Class;

public class Student {

    private String firstName;
    private String lastName;
    private int schoolNumber;
    private int phoneNumber;

    private static int studentCount;

    public Student(String firstName, String lastName, int schoolNumber, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNumber = schoolNumber;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }

    public Student(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
