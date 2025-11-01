package variable;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of a and b are :"+sum);
        sc.close();
    }
}
