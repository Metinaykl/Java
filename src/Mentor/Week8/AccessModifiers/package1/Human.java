package AccessModifiers.package1;

public class Human  {



    public String name; //her calass ve package ulaşılabilior.
    private int age; //kendi class içinden erişim sağlanıyor
    protected String memories;   //kalıtım yapılınca baska classalrdan görüntülebilmesi için
    String nickName;// default olmus oluyor bunun belirteci yok.bir
    // brlitec yazılmazsa sadece bulundugu paketle ersişebilir.

    public Human(String name, int age, String memories, String nickName) {
        this.name = name;
        this.age = age;
        this.memories = memories;
        this.nickName = nickName;
    }

}
