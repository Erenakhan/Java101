<h1>Java ile hesap makinasi</h1>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km,yaş,tip,tutar,TipIndirim,YaşIdirim,ücret=0,10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Km giriniz : ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yaş = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz 
        (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = inp.nextInt();


            tutar= ücret*km

            if (age <= 0) || (km <= 0) || (tip = 1 && tip =2 ){
                  System.out.println("Hatalı Veri Girdiniz !");  
            }
            else(){

            }

        if (tip = 2){
            tutar -= (tutar)/5
        }
        else if(age < 12){
            tutar -= tutar/2
        }
        else if(age>12 && age<24){
            tutar -= tutar/10
        }
        else if(age>65){
            tutar -= (tutar/100)*30
        }

        }
        System.out.println("Toplam Tutar :" + tutar)

    }
