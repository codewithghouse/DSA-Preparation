package functions;

import java.util.Scanner;

public class product {

    // function to find the product of two variable
    public static int Mul(int a, int b){
        int result= a*b;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        // function ke zariye ham product nikalne wale hai
        System.out.println("the product of a and b are :"+Mul(a,b));
    }
}
