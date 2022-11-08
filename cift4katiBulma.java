import java.util.Scanner;

public class cift4katiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i,top=0;

        do{
            System.out.print("Sayı Giriniz : ");
            i = inp.nextInt();
            if (i%4==0&&i%2==0){
                top+=i;

            }

        }while(i%2==0);

        System.out.print("Çift ve 4'ün katları olan sayıların toplamı : " + top);



    }
}
