import java.util.Scanner;


public class kdvTutariHesaplama {
    public static void main(String[] args) {
        double a, b, c, d, tutar, kdv1, kdv2;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen aldığınız ürünlerin fiyatlarını giriniz.");
        a = inp.nextDouble();
        b = inp.nextDouble();
        c = inp.nextDouble();
        d = inp.nextDouble();

        tutar = (a+b+c+d);
        kdv1 = tutar * 0.18;
        kdv2 = tutar * 0.08;
        double sonuc = (tutar >= 1000) ? tutar+kdv2 : tutar+kdv1;

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + sonuc);
        System.out.println("KDV tutarı = " + (sonuc - tutar));

    }
}
