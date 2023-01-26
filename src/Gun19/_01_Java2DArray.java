package Gun19;

public class _01_Java2DArray {
    public static void main(String[] args) {

        int[][] tablo={
                {3,4,55},
                {234,22,33}
        }; //2 satır 3 sütün

        System.out.println("satir uzunluğu = " +tablo.length);//2
        System.out.println("0.satırın uzunluğu ="+tablo[0].length); //3
        System.out.println("1.satırın uzunluğu = "+tablo[1].length); //3

        for (int i = 0; i < tablo.length ; i++) // satır sayısı
        {
            // ilgili satır uzunluğu
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
