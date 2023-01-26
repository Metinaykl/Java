package Gun21;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Mentor {
    public static void main(String[] args) {

        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};
        int enb=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>enb)
                enb=arr[i];
            
        }
        System.out.println("enb = " + enb);
            }

        }