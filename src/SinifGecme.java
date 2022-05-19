import java.sql.SQLOutput;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik,toplam = 0;
        double avarage;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Matematik notunuzu giriniz:");
            mat = input.nextInt();
            if ( mat < 0 || mat > 100 ){
                System.out.println("Matematik dersi ortalamaya dahil edilmedi.");
            }else {
                toplam += mat;
            }
            System.out.print("Fizik notunuzu giriniz:");
            fizik = input.nextInt();
            if ( fizik < 0 || fizik > 100 ){
                System.out.println("Fizik dersi ortalamaya dahil edilmedi.");
            }else {
                toplam += fizik;
            }
            System.out.print("Kimya notunuzu giriniz:");
            kimya = input.nextInt();
            if ( kimya < 0 || kimya > 100 ){
                System.out.println("Kimya dersi ortalamaya dahil edilmedi.");
            }else {
                toplam += kimya;
            }
            System.out.print("Turkce notunuzu giriniz:");
            turkce = input.nextInt();
            if ( turkce < 0 || turkce > 100 ){
                System.out.println("Turkce dersi ortalamaya dahil edilmedi.");
            }else {
                toplam += turkce;
            }
            System.out.print("Muzik notunuzu giriniz:");
            muzik = input.nextInt();
            if ( muzik < 0 || muzik > 100 ){
                System.out.println("Muzik dersi ortalamaya dahil edilmedi.");
            }else {
                toplam += muzik;
            }
            avarage = toplam / 5;
            if( avarage < 55 ){
                System.out.println("Sinifta kaldıniz, seneye tekrar gorusmek uzere...");
            }else {
                System.out.println("Tebrikler sinifi gectiniz!");
            }
            System.out.println("Ortamalaniz:" + avarage );
        }catch (Exception e){
            System.out.println("Girdiginiz degerleri kontrol edin.");
        }

    }
}