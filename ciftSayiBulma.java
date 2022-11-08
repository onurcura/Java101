import java.util.Scanner;

public class ciftSayiBulma {
    public static void main(String[] args) {
        int i =0, j,top=0,n=0,ort;;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz : ");
        j = inp.nextInt();
        System.out.print("Sıfırdan Girdiğiniz Değere Kadar İkiye Kalansız Bölünen Sayılar : " );
        while(i<=j){
            if(i%3==0&&i%4==0&&i!=0){

                top+=i;
                n+=1;
            }
            if(i%2==0&&i!=0){
                System.out.print(i + ",");
            }
            i++;
        }
        ort=top/n;
        System.out.println();

        System.out.println( "Sıfırdan Girdiğiniz Değere Kadar Üçe ve Dörde Kalansız Bölünen Sayıların Ortalaması : " +ort);

    }
}
