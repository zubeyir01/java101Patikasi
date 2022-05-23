import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int n,toplam = 0;
        Scanner s = new Scanner(System.in);

        do{
            System.out.print("Sayi girin:");
            n = s.nextInt();
            if(n%2 == 0 && n%4 == 0){
                toplam += n;
            }
        }while(!(n%2 == 1));
        System.out.print("Cift ve 4'un kati olan sayilarin toplami:" + toplam);
    }
}
