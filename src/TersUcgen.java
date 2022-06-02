import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Basamak sayisi:");
        int n = s.nextInt();
        // Ters üçgen çizen döngü;
        for (int x = n; x >= 1; x--) {
            for (int y = 1; y <= n - x; y++)
                System.out.print(" ");

            for (int z = 1; z <= 2 * x - 1; z++)
                System.out.print("*");

            System.out.println();
        }
    }
}
