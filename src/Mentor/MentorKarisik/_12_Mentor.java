package Mentor;

public class _12_Mentor {
    public static void main(String[] args) {

        int[] sayi={5,6,8,12,14,19};
        int toplam=0;
        int eksi=0;
        for (int i = 0; i < sayi.length; i++)
        {
            if (i%2==0){
                toplam=toplam+sayi[i];}
            else if (i%2==1)
            {
                eksi=eksi+sayi[i];

            }

            System.out.println("i = " + toplam+eksi);
        }


    }

}
