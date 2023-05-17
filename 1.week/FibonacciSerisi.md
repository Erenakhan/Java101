import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısı: ");
        int elemanSayisi = input.nextInt();
        
        int ilkSayi = 0, ikinciSayi = 1, sonrakiSayi;
        System.out.print("0 1 ");

        for (int i = 2; i < elemanSayisi; i++) {
            sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.print(sonrakiSayi + " ");

            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
    }
}
