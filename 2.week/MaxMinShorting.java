import java.util.Arrays;
import java.util.Scanner;

public class MinMaxYakin {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= inp.nextInt();

        int[] numbers={112,12,788,50,-1,-978,22,70};
        Arrays.sort(numbers);
        int closeMax=0, closeMin=0;

        for(int a:numbers){
            if (sayi<a){
                closeMax=a;
                System.out.println("Girilen sayıdan büyük en yakın sayı :"+closeMax);
                break;
            }
        }
        for (int i=numbers.length-1; i>0; i--){
            if (sayi>numbers[i]){
                closeMin=numbers[i];
                System.out.println("Girilen sayıdan küçük en yakın sayı :"+closeMin);
                break;
            }
        }
    }
}