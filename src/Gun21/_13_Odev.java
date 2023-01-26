package Gun21;

import java.util.ArrayList;

public class _13_Odev {
    public static void main(String[] args) {
        ArrayList<String> ArrayList=new ArrayList<>();
        ArrayList.add("yellow");
        ArrayList.add("red");
        ArrayList.add("blue");
        ArrayList.add("red");
        ArrayList.add("blue");

        String s1= "blue";
        String s2= "yellow";


        changelnArraylist();



    }
    public static void changelnArraylist() {
        String[][] array = new String[0][];
        for (int i = 0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++)
                if (array[i][j].contains("blue"))
                    array[i][j]="yellow";
        }System.out.println("array = " + array.toString());
    }
}
