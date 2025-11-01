package functionsp;

import java.util.Scanner;
public class sumofdigit {

    // method to calculate the sum of digits
    public static void sumofd(int n){
        int mynum= n;
        int sum = 0;
        while (n>0) {
            int ld =n%10 ;// to get a last digit
         sum = sum+ld; //storing ld and adding 
         n=n/10;
            
        }
        System.out.println("the sum of digits of "+mynum+" "+"is"+" "+sum);
    }
    public static void main(String[] args) {
        System.out.println("sum of digits problem :");
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number ");
       int n=sc.nextInt();
        if(n<0){
            System.out.println("the number should  be positve");
        }else{
            //function call
        sumofd(n);
        }
    }
    
}
