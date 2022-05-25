import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Sayi gir:");
        sayi = s.nextInt();
        while (sayi != 0) {
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
        }
        System.out.print("Basamak deger toplam:" + toplam);
    }
}
