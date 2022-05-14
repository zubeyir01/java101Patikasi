import java.util.Scanner;

public class UcgendeAlanVeHipotenus {
    public static void main(String[] args) {
     int kenar_a,kenar_b,kenar_c;
     double hipotenus,ucgen_alan,ucgen_yari_cevre;
     Scanner s = new Scanner(System.in);
        System.out.print("Dik ucgenin bir kenar uzunlugunu giriniz:");
        kenar_a = s.nextInt();
        System.out.print("Dik ucgenin diger kenar uzunlugunu giriniz:");
        kenar_b = s.nextInt();
        hipotenus = Math.sqrt((kenar_a * kenar_a) + (kenar_b * kenar_b)) ;
        System.out.println("Hipotenus:"+hipotenus);

        // Ucgenin Alanini hesaplama
        System.out.println("Ucgende Alan Hesabi");
        System.out.print("1.kenar uzunlugunu giriniz:");
        kenar_a = s.nextInt();
        System.out.print("2.kenar uzunlugunu giriniz:");
        kenar_b = s.nextInt();
        System.out.print("3.kenar uzunlugunu giriniz:");
        kenar_c = s.nextInt();
        ucgen_yari_cevre = (kenar_a + kenar_b + kenar_c) / 2;
        ucgen_alan = Math.sqrt(ucgen_yari_cevre * (ucgen_yari_cevre - kenar_a) * (ucgen_yari_cevre - kenar_b) * (ucgen_yari_cevre- kenar_c));
        System.out.println("Ucgenin Alani:"+ucgen_alan);
    }
}
