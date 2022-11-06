import java.util.Scanner;

public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        double a, b, c, d,e;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Üçgenin Kenarlarını Giriniz :\n 1. Kenar : ");
        a = inp.nextDouble();

        System.out.println("2. Kenar :");
        b = inp.nextDouble();

        System.out.println("3. Kenar :");
        c = inp.nextDouble();

        d = (a+b+c)/2;

        e = Math.sqrt(d * (d-a) * (d-b) * (d-c));

        System.out.println("Üçgenin Alanı : " + e);



    }
}
