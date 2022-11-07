import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0, n = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += mat;
            n += 1;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += fizik;
            n += 1;
        }


        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += turkce;
            n += 1;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += kimya;
            n += 1;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        if (muzik < 0 || muzik > 100) {
            System.out.println("Yanlış bir değer girdiniz. Ortalamaya Dahil Edilmeyecektir.");
        } else {
            toplam += muzik;
            n += 1;
        }

        double avarage = (toplam / n);

        if (avarage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz! Not Ortalamanız : " + avarage);
        } else {
            System.out.println("Sınıfta Kaldınız! Not Ortalamanız : " + avarage);
        }

    }
}
