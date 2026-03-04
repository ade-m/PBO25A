import java.util.Scanner;
public class pertemuan2 {
    public static void main(String[] args) {
        int n = 10;
        //inputan nilai n
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Nilai n: ");
        n =  inputan.nextInt();
        System.out.println("Deret Bilangan Sebanyak n="+n);
        for (int i =0; i<=n-1;i++){
            //cetak 2 pangkat i
            int x = (int) Math.pow(2, i);
            System.out.print(x);
            if(i<n-1)  System.out.print(", ");
        }
    }
}
