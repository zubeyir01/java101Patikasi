import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        int right = 3, balance = 1500, select, add, subtract;
        String userName, password;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Username:");
            userName = input.nextLine();
            System.out.print("Password:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do {
                    System.out.println("1-Para yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cikis Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Eklemek istediginiz tutari giriniz:");
                            add = input.nextInt();
                            balance += add;
                            break;
                        case 2:
                            System.out.print("\n" + "Tutar giriniz:");
                            subtract = input.nextInt();
                            if (balance > subtract) {

                                balance -= subtract;

                            } else {
                                System.out.println("Yetersiz Bakiye");
                            }
                            break;
                        case 3:
                            System.out.println("-----------------");
                            System.out.println("Para miktari:" + balance);
                            break;
                        case 4:
                            System.out.println("Iyi gunler...");
                            right = 0;
                            break;

                    }
                } while (select != 4);

            } else {
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz!" + --right);
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                }
            }

        } while (right > 0);
    }
}


