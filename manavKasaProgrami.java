import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armutkg, elmakg, domkg, muzkg, patkg, toplam ;
        double armutFiyat=2.14, elmaFiyat=3.67, domFiyat=1.11, muzFiyat=0.95,patFiyat= 5;
        Scanner inp = new Scanner(System.in);

        System.out.println("Ürünlerin Ağırlıklarını KG Cinsinden Giriniz :");

        System.out.println("Armut :");
        armutkg = inp.nextDouble();

        System.out.println("Elma :");
        elmakg = inp.nextDouble();

        System.out.println("Domates :");
        domkg = inp.nextDouble();

        System.out.println("Muz :");
        muzkg = inp.nextDouble();

        System.out.println("Patlıcan :");
        patkg = inp.nextDouble();

        toplam = armutkg * armutFiyat + elmakg * elmaFiyat + domkg * domFiyat + muzkg * muzFiyat + patkg * patFiyat;

        System.out.println("Armut Kaç Kilo ? : " + armutkg);
        System.out.println("Elma Kaç Kilo ? : " + elmakg);
        System.out.println("Domates Kaç Kilo ? : " + domkg);
        System.out.println("Muz Kaç Kilo ? : " + muzkg);
        System.out.println("Patlıcan Kaç Kilo ? : " + patkg);
        System.out.println("Toplam Tutar : " + toplam);



    }
}
