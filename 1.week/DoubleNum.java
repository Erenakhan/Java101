/* Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
         int num,;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Sayıyı Girin: ");
        num = inp.nextInt();

        if(num % 2 == 0) {
            System.out.print("Girilen Sayıyı Çift");
        }
        else{
            System.out.print("Girilen Sayıyı Tek");
        }
       
    }
}

