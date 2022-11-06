import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, password1;
        int opt;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("java")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.print("Hatalı Giriş Yaptınız. Yeni Şifre Oluşturmak İster misiniz? İstiyorsanız 1'e Basınız : ");
            opt = inp.nextInt();
            if (opt == 1) {
                System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                inp.nextLine();
                password1 = inp.nextLine();
                if (password1.equals("java") || password1.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifreniz oluşturuldu.");
                }


            } else {
                System.out.println("İyi GÜnler Dileriz.");
            }

        }


    }
}
