import java.util.Scanner;

public class ucakBiletiFiyati {
    public static void main(String[] args) {
        int km, yas, yt;
        double ind1 = 0.5, ind2 = 0.1, ind3 = 0.3, ind4 = 0.2, tutar, mbu = 0.1;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Gideceğiniz Mesafeyi Giriniz : ");
        km = inp.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = inp.nextInt();
        System.out.print("Biletinizi Tek Yön Almak İçin 1 Gidiş Dönüş Almak İçin 2 yazınız : ");
        yt = inp.nextInt();

        if (km < 0 || yas < 0 || yt <= 0 || yt >= 3) {
            isError = true;
        }

        tutar = km * mbu;
        if (yas < 12) {
            tutar -= tutar * ind1;
        } else if (yas <= 24) {
            tutar -= tutar * ind2;
        } else if (yas > 65) {
            tutar -= tutar * ind3;
        }

        if (yt == 1) {

        }else{
            tutar-=tutar*ind4;
            tutar = 2*tutar;
        }


        if (isError) {
            System.out.print("Hatalı Veri Girdiniz!");
        } else {
            System.out.print("Toplam Tutar : " + tutar + " TL");

        }

    }
}
