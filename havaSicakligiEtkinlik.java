import java.util.Scanner;

public class havaSicakligiEtkinlik {
    public static void main(String[] args) {
        int sicaklik ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Sıcaklığı Giriniz : ");
        sicaklik = inp.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if (sicaklik<15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if (sicaklik<25){
            System.out.println("Pikniğe Gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }
}
