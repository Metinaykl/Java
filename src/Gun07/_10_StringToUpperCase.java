package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {

        //toupperCase : string büyük harfe çevirir

        String text="Merhaba Dünya";
        System.out.println("orjinal hali=" + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me ile veya ME ile başlıyormu = " + text.toUpperCase().startsWith("ME"));

        System.out.println("text = " + text);
    }
}
