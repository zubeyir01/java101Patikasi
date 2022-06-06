import java.util.Scanner;

public class Recursive {
    // 1'den n'e kadar olan sayilarin toplami
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static int Fibonacci(int n) {

        if (n == 1 || n == 2) {               // 1 1 2 3 5
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (x == 1) {
            return 1;
        }
        return x * power(x, y - 1);
    }

    static int Factoriel(int x) {
        if (x == 0) {
            return 1;
        }
        return x * Factoriel(x - 1);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi gir:");
        int x = input.nextInt();
        System.out.print("1'den " + x + "'e kadar olan sayilarin toplami:" + sum(x));
        System.out.println("\n" + x + ". Fibonacci sayisi:" + Fibonacci(x));

        if (isPrime(x))
            System.out.println(x + " bir Asal sayidir.");
        else
            System.out.println(x + " bir Asal sayi degildir.");

        System.out.print("Taban degeri giriniz:");
        int taban = input.nextInt();
        System.out.print("Us degeri giriniz:");
        int us = input.nextInt();

        if (taban == 0 && us == 0) {
            System.out.println("Belirsiz!");
        } else
            System.out.println("Sonuc:" + power(taban, us));

        System.out.print("Faktoriyeli alinacak sayiyi giriniz:");
        int fac = input.nextInt();

        if (fac < 0) {
            System.out.println("Lutfen pozitif tam sayi girin.");
        } else
            System.out.println("Sonuc:" + Factoriel(fac));
    }
}

// 7 + sum(6)
// 7 + 6 + sum(5)
// 7 + 6 + 5 + sum(4)
// 7 + 6 + 5 + 4 + sum(3)
// 7 + 6 + 5 + 4 + 3 + sum(2)
// 7 + 6 + 5 + 4 + 3 + 2 + sum(1)
// 7 + 6 + 5 + 4 + 3 + 2 + 1
// hafızada olan parçalanmış toplama işlemi 7 + 6 + 5 + 4 + 3 + 2 +
//en son sum(1) den gelen 1 de eklenince toplam sonuç = 28 olur. Recursive Mantığı bu şekilde.