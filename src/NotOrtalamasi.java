import java.util.Scanner;
public class NotOrtalamasi {

    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int mat,fizik,kimya,turkce,tarih,muzik;

            System.out.print("Matematik notunuzu giriniz:");
            mat=s.nextInt();

            System.out.print("Fizik notunuzu giriniz:");
            fizik=s.nextInt();

            System.out.print("Kimya notunuzu giriniz:");
            kimya=s.nextInt();

            System.out.print("Turkce notunuzu giriniz:");
            turkce=s.nextInt();

            System.out.print("Tarih notunuzu giriniz:");
            tarih=s.nextInt();

            System.out.print("Muzik notunuzu giriniz:");
            muzik=s.nextInt();

            double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
            System.out.println("Ortalamaniz:"+ort);

            String basari =  (ort>60) ? "Sinifi gectiniz!":"Sinifta kaldiniz!";
            System.out.println(basari);

    }
}
