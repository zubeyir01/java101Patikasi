import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik seri alınacak sayiyi giriniz:");
        int n = input.nextInt();
        for (double i = 1.0; i < n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
