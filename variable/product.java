package variable;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("-------");
        System.out.println("the product of a and b are "+product);
    }
}
