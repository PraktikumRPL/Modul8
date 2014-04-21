package fibbonaci;
import java.util.Scanner;
public class Faktorial {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input : ");
        int n = in.nextInt();
        int x =1;
        for(int i=n;i>0;i--){
            x*=i;
        }
        System.out.println("Hasil : " + x);
    }
}
