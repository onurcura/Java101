import java.util.Scanner;

public class harmonikSayiHesaplama {
    public static void main(String[] args) {
        int num;
        double total=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        num= inp.nextInt();

        for(double i =1;i<=num;i++){
            total +=(1/i);

        }
        System.out.print("Sonuç : " +total);

    }
}
