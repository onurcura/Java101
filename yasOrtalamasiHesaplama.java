import java.util.Scanner;


public class yasOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz.");
        mat = inp.nextInt();

        System.out.println("Fizik notunu giriniz.");
        fizik = inp.nextInt();

        System.out.println("kimya notunu giriniz.");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunu giriniz.");
        turkce = inp.nextInt();

        System.out.println("Tarih notunu giriniz.");
        tarih = inp.nextInt();

        System.out.println("Müzik notunu giriniz.");
        muzik = inp.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik ) / 6.0;

        System.out.println("Not Ortalamanız " + ort);

        String str = (ort >= 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(str);



    }
}
