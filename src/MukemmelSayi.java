import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int n = s.nextInt();
        int toplam = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " Mukemmel sayidir.");
        } else {
            System.out.println(n + " Mukemmel sayi degildir.");
        }
    }
}
