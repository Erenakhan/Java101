import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob, ekok, i;
        
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        
        i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        
        ekok = (n1 * n2) / ebob;
        
        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + ekok);
    }
}
