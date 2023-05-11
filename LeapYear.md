import java.util.Scanner;

public class main {
   public static void main(String[] args) {


	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Yıl giriniz: ");
	   int years = scanner.nextInt();
	   
 
	   if(years % 4 == 0 ||  years % 400 == 0) {
		   System.out.println(years + " bir artık yıldır");
		   
	   }else {
		   System.out.println(years + " bir artık yıl değildir");
	   }
	   
	   
   }
}