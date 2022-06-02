import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz:");
        int n = s.nextInt();
        int i = 0;
        int sayi, min = 0, max = 0;
        while (i < n) {
            System.out.print(i + 1 + ". sayiyi giriniz:");
            sayi = s.nextInt();
            if (i == 0) {
                min = sayi;
                max = sayi;
            } else {
                if (sayi < min) {
                    min = sayi;
                } else if (sayi > max) {
                    max = sayi;
                }
            }
            i++;
        }

        System.out.print("En kucuk sayi:" + min);
        System.out.print("\nEn buyuk sayi:" + max);


    }
}
