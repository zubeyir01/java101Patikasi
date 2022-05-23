import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        int sayi,i;
        int count =0,toplam =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi girin:");
        sayi = input.nextInt();

        for(i =0 ; i < sayi ; i++ ){
            if( i%3 == 0 && i%4 == 0){
                toplam+=i;
                count++;
            }
        }

        System.out.println("3e ve 4e tam bolunen sayilarin aritmetik ortalamasi:" + (toplam / --count));

    }
}
