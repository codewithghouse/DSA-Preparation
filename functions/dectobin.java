package functions;

import java.util.Scanner;

public class dectobin {
    // function to calculate the decimal to binary number
    public static void dectobin(int n){
        int mynum = n;
        int pow=0;
        int bin=0;
        while (n>0) {
            int lastdigit = n%2; // to take last digit of the number
         bin = bin + (lastdigit*(int)Math.pow(10, pow));
            pow++;
           n=n/2; //permanent deletion of last digit

            
        }
        System.out.println("the decimaml number of "+mynum + "is"+" "+bin);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the decial number :");
        int n=sc.nextInt();
        dectobin(n);
    }
}
