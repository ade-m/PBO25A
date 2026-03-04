import java.util.Scanner;

public class pertemuan22 {
    public static void main(String[] args) {
        //inputan nilai n
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Nilai n: ");
        int n =  inputan.nextInt();
        //jika n>5 baru kita lakukan perulangan
        int z = n;
        do{
            System.out.println("x");
        }while(z>5);
        while(z>5){
            System.out.println("xy");
        }

        for(int x=0;x<n;x++){
            for(int i=n;i>=1;i--){
                    for(int j=0;j<=i-1;j++){
                        System.out.print(" ");
                    }
                    for(int k=0;k<=(n-i);k++){
                        System.out.print("*");
                    }
                    for(int l=1;l<=(n-i);l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                
                for(int i=n-1;i>=1;i--){
                    for(int k=0;k<=(n-i);k++){
                        System.out.print(" ");
                    }
                    for(int j=0;j<=i-1;j++){
                        System.out.print("*");
                    }
                    for(int j=1;j<=i-1;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
        }
    }
}
