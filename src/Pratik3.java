import java.util.Scanner;

public class Pratik3 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Sayi gir:");
        n = s.nextInt();
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.print("<-- 4'un kuvvetleri");
        System.out.println("\n");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + " ");
        }
        System.out.print("<-- 5'in kuvvetleri");
    }
}
