import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int km;
        double tutar = 0;
        byte yas, yolculuk_Tipi;
        Scanner s = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz:");
        km = s.nextInt();

        System.out.print("Yasinizi giriniz:");
        yas = s.nextByte();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis-Donus :");
        yolculuk_Tipi = s.nextByte();
        if ((yas >= 0) && (km > 0) && (yolculuk_Tipi == 1 || yolculuk_Tipi == 2)) {

            if (yolculuk_Tipi == 1) {
                tutar = km * 0.10;
                if (yas < 12) {
                    tutar -= (tutar *= 0.5);
                } else if (yas >= 12 && yas <= 24) {
                    tutar -= (tutar *= 0.1);
                } else if (yas > 65) {
                    tutar -= (tutar *= 0.3);
                }

            } else {
                tutar = km * 0.1;

                if (yas < 12) {
                    tutar -= (tutar *= 0.5);
                } else if (yas >= 12 && yas <= 24) {
                    tutar -= (tutar *= 0.1);
                } else if (yas > 65) {
                    tutar -= (tutar *= 0.3);
                }
                tutar -= (tutar * 0.2);
                tutar *= 2;
            }

            System.out.println("Toplam tutar:" + tutar);

        } else {
            System.out.println("Hatali veri girdiniz!");
        }

    }
}
