import java.util.Scanner;

public class vucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vke;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = inp.nextDouble();

        System.out.println("Lütfen Kilonuzu Kg Cinsinden Giriniz : ");
        kilo = inp.nextDouble();

        vke = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz : " + vke );
    }
}
