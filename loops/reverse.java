package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number you want to reverse :");
       int n=sc.nextInt();
        int reverse=0;
        System.out.println("the given number to be reversed : "+n);
        // ensure that this condition should be there 
        while (n>0) {
            
            int lastdigit=n%10;
        //   storing the last digit number int he new variable
        reverse=reverse*10+lastdigit;
        // System.out.print(reverse);
            // removing the last digit from the orignal number
            n=n/10;
            
        }
        System.out.println("the reverse number is : "+reverse);
      
    }
}
