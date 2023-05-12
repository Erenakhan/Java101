/* Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
         int num;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı Girin: ");
        num = inp.nextInt();


        for (i=0; i<num; i *=4) {
            System.out.print("4 kuvvet " + i);  
         }
        for (i=0; i<num; i *=5) {
        System.out.print("5 kuvvet " + i);  
        }
}