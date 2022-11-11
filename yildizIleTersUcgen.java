import java.util.Scanner;

public class yildizIleTersUcgen {
    public static void main(String[] args) {

        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program.
        int n;
        Scanner inp= new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        n= inp.nextInt();

        for(int i =n;i>=1;i--){
            for(int j=(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int k =(2*i-1);k>=1;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
