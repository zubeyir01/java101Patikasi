import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 1;
        int toplam;
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayi gir:");
        int input = s.nextInt();
        System.out.print(input + " Haneli Fibonacci serisi: ");
        for (int i = 0; i <= input; i++) {
            System.out.print(s1 + " ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
