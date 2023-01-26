package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5 lere kadar halini yapınız

        for (int a=1;a<=5; a++) {

            for (int b = 1; b <= 10; b++)
                System.out.println(a+"x"+b+"="+(a*b));
            System.out.println();
        }

    }
}
