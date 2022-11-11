import java.util.Scanner;

public class fibonacciBulma {
    public static void main(String[] args) {

        //Java döngüler ile fibonacci serisi bulan program.

        int num;
        int b=0;
        int result=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        num = inp.nextInt();
        System.out.print(num + " Elemanlı Fibonacci Serisi : ");

        for(int i =0;i<=(num-1);i++){
            System.out.print(b +" ");
            result +=b;
            b=result-b;
        }




    }
}
