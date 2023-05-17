/* Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
         int num,sum,loopCount=0;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Sayıyı Girin: ");
        num = inp.nextInt();

        for (int i = 0; i < num; i++){
            if(i%3 ==0 & i%4 == 0){
             sum += i ;
             loopCount++;
        }
    }
    System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen sayilarin toplami : "+sum);
    
        if (loopCount == 0) {
            System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen bir sayi yok.");
        } else {
            double aver =  sum / loopCount;
            System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen sayiların ortalamasi: " + aver);
        }
    }
}

