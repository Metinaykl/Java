package Gun26._02_Ornek;

public class Person {
    String name;
    String surname;
    int age;
    public void BilgiYazdir(){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }

    public String toString() {
        return name+" "+surname+" "+age;
    }
    public void getBirthYear(){
        System.out.println(2022-age);
        
    }
    public void getInitials (){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".");
    }
}
