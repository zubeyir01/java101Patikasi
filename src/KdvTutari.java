import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {

        double fiyat,kdvFiyat,kdvTutari;

        Scanner s = new Scanner(System.in);
        System.out.println("Fiyati giriniz:");
        fiyat = s.nextInt();

        kdvFiyat = (fiyat <=1000 && fiyat>=0)? (fiyat*18)/100 : (fiyat*8)/100;
        kdvTutari = kdvFiyat - fiyat;

        System.out.println("KDV\'siz Fiyat:"+fiyat);
        System.out.println("KDV\'li Fiyat:"+(fiyat+kdvFiyat));
        System.out.println("KDV tutari:"+kdvFiyat);

    }
}
