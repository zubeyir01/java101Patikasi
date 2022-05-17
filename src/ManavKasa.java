import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5;
        double toplam_tutar = 0;
        int kilogram;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kac kilo ? :");
        kilogram = input.nextInt();
        toplam_tutar += (armut*kilogram);

        System.out.print("Elma kac kilo ? :");
        kilogram = input.nextInt();
        toplam_tutar += (elma*kilogram);

        System.out.print("Domates kac kilo ? :");
        kilogram = input.nextInt();
        toplam_tutar += (domates*kilogram);

        System.out.print("Muz kac kilo ? :");
        kilogram = input.nextInt();
        toplam_tutar += (muz*kilogram);

        System.out.print("Patlican kac kilo ? :");
        kilogram = input.nextInt();
        toplam_tutar += (patlican*kilogram);

        System.out.print("Toplam Tutar :" + toplam_tutar);
    }
}
