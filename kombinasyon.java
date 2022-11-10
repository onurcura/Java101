import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n,r,top1=1,top2=1,top3=1,C;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz kombinasyonun C(n,r) olacak şekilde sırasıyla n ve r değerlerini giriniz : ");
        n = scan.nextInt();
        r = scan.nextInt();

        for(int i =1;i<=n;i++){
            top1 *= i ;
        }
        for(int i =1;i<=r;i++){
            top2 *= i ;
        }
        for(int i =1;i<=(n-r);i++){
            top3 *= i ;
        }

        C = top1/(top2*top3);
        System.out.println("C(n,r) : " + C);
    }
}
