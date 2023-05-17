import java.util.Scanner;
public class Main {

    public static boolean isPrime(int num, int divider){
        if (num < 2) { // 2'den kücük sayılar asal değil.
            return false;
        }
        if (num == 2){ 
            return true;
        }
        if (num % divider == 0) { 
            return false;
        }
        if (divider * divider > num){ 
            return true;
        }
        return asalMi(num, divider +1)
        }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girinizi :");
        int num = inp.nextInt();

        if (isPrime(num,divider)){
            System.out.println(num + " asal bir sayıdır.");
        } else {
            System.out.println(num + " asal bir sayı değildir.");
        }


    }
}