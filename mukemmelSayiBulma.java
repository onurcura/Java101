import java.util.Scanner;

public class mukemmelSayiBulma {
    public static void main(String[] args) {
        int num,total=0;
        Scanner inp= new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        num = inp.nextInt();

        for(int i=1;i<num;i++){
            if(num%i==0){
                total +=i;
            }

        }

        if(num==total){
            System.out.print(num + " Mükemmel Sayıdır.");
        }else{
            System.out.print(num + " Mükemmel Sayı Değildir.");
        }
    }
}
