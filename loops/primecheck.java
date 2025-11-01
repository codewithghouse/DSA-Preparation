package loops;

import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to chekc is it prime or not");
        int number = sc.nextInt();
        // here we are assuming that ke number prime hai
        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        }else if(number==2){
            System.out.println("is a prime number ; ");
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
              if(number%i==0){
                isPrime=false;
                break;
                // no further checking the anyone number n-1 should give raminder 0
              }

        }
        if(isPrime){
            System.out.println("the numer is prime"+number);
        }else{
            System.out.println("the number is not prime : "+number);
        }
        }

    }
}
