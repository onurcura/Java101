import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int sayi,kalan,kalan2,sayi2,ekok,ebob=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı 1 : ");
        sayi = inp.nextInt();
        System.out.print("Sayı 2 : ");
        sayi2 = inp.nextInt();


        int i=1;
        while(i<=sayi){

            if(i>sayi2){
                break;
            }
            kalan = (sayi%i);
            kalan2= (sayi2%i);
            if(kalan==0&&kalan2==0){
                ebob=i;
            }
            i++;
        }
        ekok = (sayi*sayi2)/ebob;
        System.out.println("ebob : "+ebob);
        System.out.println("ekok : "+ekok);



    }
}
