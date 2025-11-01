package practice;

import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number here ");
    int n = sc.nextInt();
    int fact =1;
    if(n<0){
        System.out.println("enter only positive number");
        
    }else{
        
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("the factorailof a number is a :"+ fact);
    }
  }   
}
