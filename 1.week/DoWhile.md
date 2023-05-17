import java.util.Scanner;

public class SumOfEvenAndMultiplesOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0 giriniz): ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}
