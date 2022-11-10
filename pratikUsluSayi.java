import  java.util.Scanner;

public class pratikUsluSayi {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program.

        int a,b,total=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        a= inp.nextInt();
        System.out.print("Üssü olacak sayı :");
        b=inp.nextInt();

        for(int i=1;i<=b;i++){
            total *=a;

        }
        System.out.print("Cevap : " + total);



    }
}
