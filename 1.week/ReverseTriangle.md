import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int n = input.nextInt();
        input.close();
        
        for(int i=n; i>=1; i--){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
