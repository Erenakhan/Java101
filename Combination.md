import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int numerator = 1, denominator = 1;

        for (int i = n; i >= n - r + 1; i--) {
            numerator *= i;
        }

        for (int i = r; i >= 1; i--) {
            denominator *= i;
        }

        int result = numerator / denominator;
        System.out.println(n + " sayısının " + r + "'li kombinasyonu: " + result);
    }
}
