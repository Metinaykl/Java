package Gun21;

public class _09_Mentor {
    public static void main(String[] args) {
        // Ornek 2 : Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        String str=String.valueOf(ch);
        System.out.println("str = " + str);

        String str2=new String(ch);
        System.out.println(str);

        String kelime="";
        for (int i = 0; i <ch.length ; i++) {
            kelime+=ch[i];

        }
        System.out.println("kelime = " + kelime);

    }
}
