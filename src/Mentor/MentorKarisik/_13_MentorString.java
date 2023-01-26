package Gun15;

public class _13_MentorString {
    public static void main(String[] args) {
        // Ornek 1 - Verilen bir String ifadeyi tersten yazdiran bir program yaziniz
        String cumle = "Hello World";

        for (int i =cumle.length()-1; i >=0; i--) {
            System.out.print(cumle.charAt(i));
            
        }
    }
}
