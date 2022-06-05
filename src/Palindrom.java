import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int lastNumber, reverseNumber = 0, tempNumber;
        tempNumber = number;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;

        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int number = scan.nextInt();
        if (isPalindrom(number)) {
            System.out.println("Girilen sayi palindrom sayidir.");
        } else {
            System.out.println("Girilen sayi palindrom sayi degildir.");
        }

    }
}

