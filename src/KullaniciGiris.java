import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword;
        String usrName, password1;
        String select;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adiniz:");
        userName = input.nextLine();
        System.out.print("Sifreniz:");
        password = input.nextLine();

        System.out.println("Kayit basarili!");

        System.out.print("Kullanici adi:");
        usrName = input.nextLine();
        System.out.print("Sifre:");
        password1 = input.nextLine();

        if (userName.equals(usrName) && password.equals(password1)) {
            System.out.println("Giris basarili!");
        } else {
            System.out.println("Kullanici adi veya sifre yanlis!");
            if (userName.equals(usrName)) {
                System.out.println("Sifrenizi sifirlamak istiyor musunuz? Y or N");
                select = input.next();
                switch (select) {
                    case "Y": {
                        System.out.print("Yeni sifrenizi giriniz:");
                        newPassword = input.next();
                        if (newPassword.equals(password) || newPassword.equals(password1)) {
                            System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                        } else {
                            System.out.println("Sifre olusturuldu.Tekrar giris yapin");
                        }
                    }
                    break;
                    case "N":
                        System.out.println("Try again.");
                        break;
                    default:
                        System.out.println("Sadece 'Y' veya 'N' girin.");
                }
            } else {
                System.out.println("Kullanici bulunamadi");
            }
        }
    }
}
