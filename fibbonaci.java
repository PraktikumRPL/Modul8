package fibbonaci;
import java.util.Scanner;
public class Fibbonaci3 {
    public static void main(String[] args) {
        int a=0, b=1;
        int[] hasil ;
        hasil = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int fib = input.nextInt();
        System.out.print("Hasil : ");
        for (int i=1; i<= fib; i++){
            a+=b;
            b=a-b;
            hasil[i]=a;
        }
        for (int i = fib; i >=1 ; i--){
            System.out.print(hasil[i]+" ");
        }
    }
}

