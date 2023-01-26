package Gun29.MentorMethod;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(4);
        numbers.add(20);
        numbers.add(7);
        numbers.add(8);
        numbers.add(8);
        numbers.add(5);
        numbers.add(null);

        for (Integer number:numbers){
            if (number==null)
                continue;
            if (number==4)
                System.out.println(number);
            System.out.print(number+ "|");

        }

        for (int i = 1; i <=10 ; i++) {
            if (numbers.contains(i)){
                System.out.println(i+"set içinde var.");
            }else {
                System.out.println(i+"set içinde yok.");
            }

        }
    }
}
