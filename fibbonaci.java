package fibbonaci;
import java.util.Scanner;
public class Fibbonaci {
    public static void main(String[] args) {
        int a=0, b=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int fib = input.nextInt();
        System.out.print("Hasil : ");
        for (int i=1; i<= fib; i++){
            a+=b;
            b=a-b;
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
