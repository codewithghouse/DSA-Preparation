package functions;

import java.util.Scanner;

public class primeinrange {

    // function to check prime or not
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }
    // function to print the prime number between the range
    public static void primerange(int n){
        // yahan pe i 2 se 8 tak chalta hai 
        for(int i=2;i<=n;i++){
          if(prime(i)){
            System.out.print(i+ " ");
          }
        }

    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the value of n: ");
       int n = sc.nextInt();
        primerange(n);
    }
}
