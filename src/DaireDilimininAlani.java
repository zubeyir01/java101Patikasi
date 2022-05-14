import java.util.Scanner;
public class DaireDilimininAlani {
    public static void main(String[] args) {
    final double pi = 3.14;
    int r , angle;
    double alan,cevre;
    Scanner input = new Scanner(System.in);

    System.out.print("Yaricapi giriniz:");
    r = input.nextInt();

    alan = pi * (r * r);
    cevre = 2 * pi * r;

    System.out.println("Dairenin alani:" + alan);
    System.out.println("Dairenin cevresi:" + cevre);

    System.out.print("Merkez açısını giriniz:");
    angle = input.nextInt();

    alan = (pi * ( r * r) * angle) / 360;
    System.out.print("Daire diliminin alani:" + alan);
    }
}
