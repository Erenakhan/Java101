public class AsalSayilar {

    public static void main(String[] args) {
        int i, j;
        boolean asal;
        
        for (i = 2; i <= 100; i++) { // 1 asal sayı değildir, dolayısıyla 2'den başlıyoruz
            asal = true; // asal olduğunu varsayıyoruz
            
            // i'nin kendisi hariç diğer pozitif tam bölenlerine bakıyoruz
            for (j = 2; j < i; j++) {
                if (i % j == 0) { // eğer pozitif tam bölünen varsa, asal değil
                    asal = false;
                    break;
                }
            }
            
            if (asal) { // eğer asal ise ekrana yazdırıyoruz
                System.out.println(i);
            }
        }
    }
}
