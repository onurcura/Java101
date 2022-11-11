import java.util.Scanner;

public class minMaxBulma {
    public static void main(String[] args) {
        int a,num,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        a = inp.nextInt();

        int i=1;
        do{
            System.out.print(i + ". Sayıyı Giriniz : ");
            num = inp.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

            i++;

        }while(i<=a);
        System.out.println("En Büyük Sayı : " +max);
        System.out.print("En Küçük Sayı : " +min);
    }
}
