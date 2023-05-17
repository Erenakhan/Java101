import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sayi, enBuyuk, enKucuk;
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();
        
        System.out.print("1. Sayıyı giriniz: ");
        sayi = input.nextInt();
        enBuyuk = sayi;
        enKucuk = sayi;
        
        for(int i=2; i<=n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
            
            if(sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            
            if(sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enK
    }
}

