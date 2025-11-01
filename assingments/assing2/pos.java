package assingments.assing2;

import java.util.Scanner;

public class pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if((int) number >= 0){
            System.out.println("Positve Number");
        }
      else{
            System.out.println("Negative Number ");
        }
    }
}
