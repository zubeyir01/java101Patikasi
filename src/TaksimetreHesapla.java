import java.util.Scanner;
public class TaksimetreHesapla {
    public static void main(String[] args) {
    double perKM = 2.20 , km , total , startPrice = 10;

    Scanner input = new Scanner(System.in);

    System.out.print("Mesafeyi km cinsinden giriniz:");
    km = input.nextInt();

    total = (perKM * km);
    total += startPrice;

    total = (total < 20) ? 20 : total;
    System.out.print("Odenecek tutar:"+total);
    }
}
