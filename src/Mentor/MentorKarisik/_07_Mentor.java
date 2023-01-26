package Gun21;

import java.util.Arrays;

public class _07_Mentor {
    public static void main(String[] args) {

        int[]dizi=new int[10];
        System.out.println(Arrays.toString(dizi));

        dizi[0]=10;
        dizi[1]=20;
        dizi[2]=30;
        System.out.println(Arrays.toString(dizi));

        int[] numbers=new int[10];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        System.out.println(Arrays.toString(numbers));

        int[]numbers2={20,10,40};
        System.out.println(Arrays.toString(numbers2));

        for (int i = 0; i <numbers2.length ; i++) {
            System.out.println(numbers2[i]);

        }


    }
}
