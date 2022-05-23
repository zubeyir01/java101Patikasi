import java.util.Scanner;

public class KombinasyonVePermutasyon {

    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        // C(n,r) = n!/ ( r! * (n-r)!)
        int n,r,per,comb;
        Scanner s = new Scanner(System.in);
        System.out.print("Ilk sayi:");
        n = s.nextInt();
        System.out.print("Ikinci sayi:");
        r = s.nextInt();
        per = factorial(n) / factorial(n-r);
        System.out.println("P(" + n + ","+ r + "):" + per);
        comb = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("C(" + n + ","+ r + "):" + comb);
    }
}
