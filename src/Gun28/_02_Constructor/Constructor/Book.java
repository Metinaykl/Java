package Gun28._02_.Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {
        this("",0,"");
    }

    public Book(String name,int publishYear,String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }

    public Book(String name ,int publishYear){
        this(name,publishYear,"");
    }

    public String toString(){
        return name+" "+publishYear+" "+author;
    }




}
