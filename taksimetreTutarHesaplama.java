import java.util.Scanner;

public class taksimetreTutarHesaplama {
    public static void main(String[] args) {
        double a, kmtutar, sp, toplamtutar;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen gidilen mesafeyi giriniz :");
        a = inp.nextDouble();

        kmtutar= 2.20;
        sp= 10;
        toplamtutar = sp + (a*kmtutar);
        toplamtutar = (toplamtutar >= 20) ? toplamtutar : 20;
        System.out.println("Ödeyeceğiniz Tutar : " + toplamtutar);

    }
}
