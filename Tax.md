[Eng]

<h2>Calculate tax with java</h2>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
        double price,tax,taxRatio,total ;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Enter your product price: ");
        price = inp.nextDouble();

        taxRatio =(price >1000 ? 
        0.08 : 0.18)    
        tax = price * taxRatio
         total = price + tax;


        System.out.println("Your tax ratio is " + taxtRatio);
        System.out.println("Your product with tax is " + total);
        }
        

}

[Tr]

<h2>Java ile kdv hesaplama</h2>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //değişken tanımlama 
        double tutar,kdv,kdvOran,toplam;

        // scanner tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan veri alma
        System.out.print("ürün tutarınızı giriniz: ");
        tutar = inp.nextDouble();

        kdvOran =(tutar >1000 ? 
        0.08 : 0.18)    
        kdv = tutar * kdvOran;
         toplam = tutar + kdv;

        
        System.out.println("kdv oraınız " + kdvOran);
        System.out.println("ürünün kdv'li fiyatı " + toplam);
        }
        

}