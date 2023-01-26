package Mentor.Encapsulation;

public class Course {

    private String name;
    private int minScore;

    public Course(String name) {
        setName(name);
    }

    public Course(String name, int minScore) {
        setName(name);
        setMinScore(minScore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        if (minScore<50){
            System.out.println("Okul puanı 50 den küçük olamaz");}
        this.minScore = minScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", minScore=" + minScore +
                '}';
    }
}
