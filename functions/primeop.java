package functions;

import java.util.Scanner;

public class primeop {

    // prime solution optimized
    public static boolean prime(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }  
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check prime number : ");
        int a =sc.nextInt();
        System.out.println(prime(a));
        
    }
}
