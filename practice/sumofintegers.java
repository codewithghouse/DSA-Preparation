package practice;

import java.util.Scanner;

public class sumofintegers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();
        int even=0;
        int odd=0;
     for(int i=0;i<=number;i++){
        if(i%2==0){
            even+=i;
        }else{
            odd+=i;
        }
    
     }
     System.out.println("sum of even numbers are : "+even);
     System.out.println("sum of odd number : "+odd);
     System.out.println("program ended");
    }
    
}
