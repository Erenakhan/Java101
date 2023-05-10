[Eng]

<h2>Body Mass Index Calculator with Java
</h2>

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //set variable 
         double length,Weight,index;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Please enter your length (in meters)
        :" );
        length = inp.nextDouble();

        System.out.print("Please enter your Weight: ");
        Weight = inp.nextDouble();

        index = (Weight / length) *length
        

        System.out.println("Your body mass Index is" +  index);
       
        }
}

[Tr]

<h2>Java ile Vücut Kitle İndeksi Hesaplama
</h2>

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //set variable 
         double kilo,boy,indeks;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz
        :" );
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        Weight = inp.nextDouble();

        indeks = (kilo / boy) *boy
        

        System.out.println("Vücut Kitle İndeksiniz" +  indeks);
       
        }
}
