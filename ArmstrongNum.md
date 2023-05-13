import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        int digit;

        int numDigits = String.valueOf(number).length(); //sayının hanelerinin sayısı

        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        if (number == sum) {
            System.out.println(number + " Armstrong bir sayıdır.");
        } else {
            System.out.println(number + " Armstrong bir sayı değildir.");
        }
    }
}
