[Eng]
<h2>Calculate grade point average with java</h2>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //set variable 
        int math, physics, chemistry, turkish, history, music;;

        //set scanner 
        Scanner inp = new Scanner(System.in);

        //take values from user
        System.out.print("Enter your math grade: ");
        math = inp.nextInt();

        System.out.print(Enter your physics grade: ");
        physics = inp.nextInt();

        System.out.print(" Enter your chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Enter your turkish grade: ");
        turkish = inp.nextInt();

        System.out.print("Enter your history grade: ");
        history = inp.nextInt();

        System.out.print("Enter your music grade: ");
        music = inp.nextInt();

        int sum = (math + physics + chemistry + turkish + history + music);
        int result = sum / 6;
        System.out.println("your average: " + result);
        System.out.println(result >=60 ? "passed course" : "failed course");

    }

}
<h2>Java ile not ortalaması hesaplama</h2>
        
[Tr]

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        //değişkenleri tanımladık
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //scanner  tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc);
        System.out.println(sonuc >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }

}    





