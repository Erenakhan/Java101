<h1>Activity advice with java</h1>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temp

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz (celcius): ");
        temp = inp.nextDouble();


       if (temp < 5){
        System.out.print("Kayak yapabilirsiniz);
       }
       else if(temp > 5 && temp <15 ){
        System.out.print("Sinemaya gidebilirsiniz");
       }
       else if(temp > 15 && temp <25 ){
        System.out.print("Piknik Yapabilirsiniz");
       }
       else{
         System.out.print("Yüzmeye gidebilirsiniz");
       }


    }
}