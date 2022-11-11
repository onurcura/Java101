import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName,password;
        int right=3;
        int select;
        int balance=1000;
        int price;

        Scanner inp = new Scanner(System.in);



        while(right>0){
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();

            System.out.print("Şifreniz : ");
            password = inp.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba , Patika Bankasına Hoşgeldiniz!");
                do{
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap\nLütfen Yapmak İstediğiniz İşlemi Seçiniz :  ");
                    select = inp.nextInt();
                    if(select>4){
                        System.out.println("Hatalı Bir Giriş Yaptınız.");
                    }
                    switch(select){
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = inp.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiye : " + balance);
                            break;
                        case 4:
                            break;
                    }
                }while(select!=4);
                System.out.print("Tekrar görüşmek üzere.");
                break;

            }else{
                right--;
                if(right==0){
                    System.out.print("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    break;
                }else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }



    }
}
