import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz Gün : ");
        day = inp.nextInt();

        System.out.print("Doğduğunuz ay : ");
        month = inp.nextInt();

        if (month == 1) {
            if (day < 22 && day > 0) {
                burc = "Oğlak";
            } else if (day >= 22 && day <= 31) {
                burc = "Kova";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day < 20 && day > 0) {
                burc = "Kova";
            } else if (day >= 20 && day <= 28) {
                burc = "Balık";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day < 21 && day > 0) {
                burc = "Balık";
            } else if (day >= 21 && day <= 31) {
                burc = "Koç";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day < 21 && day > 0) {
                burc = "Koç";
            } else if (day >= 21 && day <= 30) {
                burc = "Boğa";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day < 22 && day > 0) {
                burc = "Boğa";
            } else if (day >= 22 && day <= 31) {
                burc = "İkizler";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day < 23 && day > 0) {
                burc = "İkizler";
            } else if (day >= 23 && day <= 30) {
                burc = "Yengeç";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day < 21 && day > 0) {
                burc = "Yengeç";
            } else if (day >= 23 && day <= 31) {
                burc = "Aslan";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day < 21 && day > 0) {
                burc = "Aslan";
            } else if (day >= 23 && day <= 31) {
                burc = "Başak";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day < 21 && day > 0) {
                burc = "Başak";
            } else if (day >= 23 && day <= 30) {
                burc = "Terazi";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day < 21 && day > 0) {
                burc = "Terazi";
            } else if (day >= 23 && day <= 31) {
                burc = "Akrep";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day < 21 && day > 0) {
                burc = "Akrep";
            } else if (day >= 22 && day <= 30) {
                burc = "Yay";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day < 22 && day > 0) {
                burc = "Yay";
            } else if (day >= 22 && day <= 31) {
                burc = "Oğlak";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Bir Giriş Yaptınız. Lütfen Tekrar Deneyiniz.");

        } else {
            System.out.println("Burcunuz : " + burc);

        }


    }
}
