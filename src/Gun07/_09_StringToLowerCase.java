package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //tolowercase : Stringi küçük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("orjinal hali text = " + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("me ile veya ME ile başlıyor mu=" + text.toLowerCase().startsWith("me"));

        System.out.println("text = " + text); // kendisine atayamazsak kendisi değişmez
        text =text.toLowerCase();
    }
}
