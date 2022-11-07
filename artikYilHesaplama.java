import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        int year;
        String yr = "" ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();

        if (year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0) {
                yr = " Bir Artık Yıl Değildir.";

            }else{
                yr=" Bir Artık Yıldır.";
            }
        }else{
            yr=" Bir Artık Yıl Değildir.";
        }
        System.out.print(year + yr);

    }
}
