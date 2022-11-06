import java.util.Scanner;

public class daireDilimininAlaniniHesaplama {
    public static void main(String[] args) {
        int r, aci;
        double alan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();

        System.out.println("Lütfen Merkez Açısının Ölçüsünü Giriniz : ");
        aci = inp.nextInt();

        alan = 3.14 * r * r * aci / 360;
        System.out.println("Daire Diliminin Alanı : "+ alan);

    }
}
