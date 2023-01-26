package Mentor.Encapsulation;

import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Course> list=new ArrayList<>();

    public School(String name, ArrayList<Course> list) {
        setName(name);
        setList(list);
    }

    public void addCourse(Course course){
        list.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getList() {
        return list;
    }

    public void setList(ArrayList<Course> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
