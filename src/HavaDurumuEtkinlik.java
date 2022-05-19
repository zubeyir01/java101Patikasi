import java.util.Scanner;
public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik giriniz:");
        heat = input.nextInt();
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*       */
        if ( heat <= 25 ) {
            if ( heat >= 10){
                System.out.println("Piknik yapabilirsiniz.");
            }
            if ( heat >= 5 && heat <= 15)
            {
                System.out.println("Sinemaya gidebilirsiniz.");
            }

        }else {
            System.out.println("Yüzme yapabilirsiniz.");
        }

    }
}
