

<h2>Java ile Manav Kasa Programı

</h2>

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //set variable 
         double 
        Armut = 2,14 ,
        Elma = 3,67 ,
        Domates = 1,11 ,
        Muz = 0,95 ,
        Patlıcan = 5,00 ,
        ArmutK,ElmaK,ElmaK,DomatesK,MuzK,Tutar,PatlıcanK;

        // scanner ayarlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri alındı
        System.out.print("Armut Kaç Kilo ?:" );
        ArmutK = inp.nextDouble();

         System.out.print("Elma Kaç Kilo ?:" );
        ElmaK = inp.nextDouble();

         System.out.print("Domates Kaç Kilo ?:" );
        DomatesK = inp.nextDouble();

         System.out.print("Muz Kaç Kilo ?:" );
        MuzK = inp.nextDouble();

         System.out.print("Patlıcan Kaç Kilo ?:" );
        PatlıcanK = inp.nextDouble();

        Tutar = Elma*ElmaK+Domates*DomatesK+Patlıcan*PatlıcanK+Muz*muzK+Armut*ArmutK;


        System.out.println("Alışveriş Tutarınız" +  Tutar);
       
        }
}

