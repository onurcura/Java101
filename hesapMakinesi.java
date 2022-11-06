import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,islem;
        Scanner inp = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        islem = inp.nextInt();

        switch (islem) {
            case 1 -> System.out.println("Sonuç : " + (n1 + n2));
            case 2 -> System.out.println("Sonuç : " + (n1 - n2));
            case 3 -> System.out.println("Sonuç : " + (n1 * n2));
            case 4 -> System.out.println("Sonuç : " + (n1 / n2));
        }


    }
}
