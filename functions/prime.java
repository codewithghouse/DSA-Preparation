package functions;

import java.util.Scanner;



public class prime {
    // function to check if a number is prime or not 
    public static int Prime(int a){
        boolean isprime= true;
         for(int i=2;i<=Math.sqrt(a);i++){
              if(a%i==0){
                isprime=false;
                break;
                // no further checking the anyone number n-1 should give raminder 0
              }
              
            }
            if(isprime){
            System.out.println("the numer is prime"+a);
        }else{
            System.out.println("the number is not prime : "+a);
        }
        return a;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        if(a<=1){
            System.out.println("the number should be greater then 2");
        }else if(a==2){
            System.out.println("the number is prime number");
        }else{
           System.out.println(Prime(a));
        }
        
    }
}
