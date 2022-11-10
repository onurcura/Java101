import java.util.Scanner;

public class armstrongSayilariBulma {
    public static void main(String[] args) {

        // Girilen sayıya kadar olan Armstrong sayılarını bulan program.

        int number;
        int basNumber;
        int basValue;
        int result;
        int total;


        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        number= inp.nextInt();
        System.out.print("Girdiğiniz sayıya kadar Armstrong sayısı olan sayılar : ");
        for(int i=1;i<=number;i++){
            basNumber=0;
            int tempNumber=i;

            while(tempNumber!=0){
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber=i;
            total=0;
            while(tempNumber!=0){

                basValue=tempNumber%10;
                result = 1;
                for(int j=1;j<=basNumber;j++){
                    result*= basValue;
                }

                total +=result;
                tempNumber /= 10;
            }
            if(i==total){
                System.out.print(i + ",");
            }


        }




    }
}
