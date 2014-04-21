package fibbonaci;
import java.util.Scanner;
public class Fibbonaci1 {
    public static void main(String[] args) {
        int a=0, b=1, hasil = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int fib = input.nextInt();
        System.out.print("Hasil : ");
        for (int i=1; i<= fib; i++){
            a+=b;
            b=a-b;
            hasil+=a;
        }
        System.out.print(hasil);
        System.out.println();
    }
}

