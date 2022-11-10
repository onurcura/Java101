import java.util.Scanner;

public class basamakSayilariniToplama {
    public static void main(String[] args) {

        // Girilen sayının basamaklarını toplayan program.

        int number;
        int basValue;
        int total=0;


        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        number= inp.nextInt();


        int tempNumber = number;

        while(tempNumber!=0){
            basValue=tempNumber%10;
            total +=basValue;

            tempNumber/=10;

        }
        System.out.print("Girdiğiniz sayının basamakları toplamı : " + total);


    }
}
