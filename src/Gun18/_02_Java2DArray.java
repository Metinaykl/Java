package Gun18;

public class _02_Java2DArray {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boş default 0 olan
        int[] dizi2={2,3,4,5,6,7,56,67,77};

        int[][] tablo=new int[2][3]; // 2 satır (row) , 3 sütun (column)
                                     // boş default değer 0 2x3 kadar 6 adet sayi

        int[][] tablo2={
                {2,3,4},
                {34,45,5}
        };
        // Tek forlu yöntem uzun ve yorucu
        for (int i = 0; i < 2; i++) {
            System.out.print(tablo2[i][0]+" "); // her bir satırın 0.elamanı
            System.out.print(tablo2[i][1]+" "); // her bir satırın 1.elamanı
            System.out.print(tablo2[i][2]+" "); // her bir satırın 2.elamanı
            System.out.println(); // her satıra yazma işleminden sonra satır atlatıyor
        }
        // 2.Forlu Yöntem Kesin ve Hatasız
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo2[satir][sutun]+" ");

                
            }
            System.out.println(); // her satıra yazma işleminden sonra satır atlatıyor
            
        }
    }
}
