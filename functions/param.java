package functions;

import java.util.Scanner;


public class param {

    // calculate a and b  function
    public static int sum(int a,int b){
        int sum= a+b;
        return sum;
    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of a ");
    int  a= sc.nextInt();
    System.out.println("enter the value of b");
    int b= sc.nextInt();
    System.out.println("the sum of a and b are :"+sum(a, b));
 }   
}
