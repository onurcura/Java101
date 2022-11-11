public class asalSayiBulma {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                System.out.print(i + " ");
            }
        }





    }
}
