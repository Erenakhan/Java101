[Eng]

<h2>Calculating the area of ​​the triangle with java</h2>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
         double edge1,edge2,edge3 ,u , area;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Enter your first edge: ");
        edge1 = inp.nextDouble();

        System.out.print("Enter your second edge: ");
        edge2 = inp.nextDouble();

        System.out.print("Enter your third edge: ");
        edge3 = inp.nextDouble();

        u = (edge1 + edge2 + edge3)/2;

        area =  𝑢 * (𝑢 − edge1)* (𝑢 − edge2) * (𝑢 − edge3) 


        System.out.print("Enter your long edge: ");
        longEdge = inp.nextDouble();


        System.out.println( The area of ​​the triangle is " +  area);
       
        }
}

[Tr]

<h2>Java ile üçgen alanı hesaplama</h2>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //değişkenler ayarlandı
         double kenar1,kenar2,kenar3 ,u , alan;

        //scanner ayarlandı 
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değer alındı
        System.out.print("İlk kenarınızı giriniz: ");
        kenar1 = inp.nextDouble();

        System.out.print("İkinci kenarınızı giriniz: ");
        kenar2 = inp.nextDouble();

        System.out.print("üçüncü kenarınızı giriniz: ");
        kenar3 = inp.nextDouble();

        u = (kenar1 + kenar2 + kenar3)/2;

        alan =  𝑢 * (𝑢 − kenar1)* (𝑢 − kenar2) * (𝑢 − kenar3) 



        System.out.println("Üçgenin alanı" +  alan);
       
        }
}