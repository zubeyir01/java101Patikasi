import java.util.Scanner;

public class ArtikYilHesapla {
    public static void main(String[] args) {
        int year;

        Scanner s = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        year = s.nextInt();

        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " bir artik yildir!");
                    } else {
                        System.out.println(year + " bir artik yil degildir!");
                    }
                } else {
                    System.out.println(year + " bir artik yildir!");
                }
            } else {
                System.out.println(year + " bir artik yil degildir!");
            }
        } else {
            System.out.println("Hatali giris!");
        }
    }
}
