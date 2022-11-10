import java.util.Scanner;

public class ikininKuvvetleriniBulma {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.

        int i,j;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        j = inp.nextInt();


        System.out.print("4'ün Kuvveti Olan Değerler : ");

        for(i=1; i<=j; i*=4 ){
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.print("5'in Kuvveti Olan Değerler : ");


        for(i=1; i<=j; i*=5 ){
            System.out.print(i + ",");
        }


    }
}
