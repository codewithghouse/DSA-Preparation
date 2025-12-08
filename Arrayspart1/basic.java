package Arrayspart1;

import java.util.Scanner;

public class basic {
   public static void main(String[] args) {
    //declaration of an array
    int marks[]= new int[50];
    // directly knowing the size of an array to make an array
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the marks of 0th index position");
  marks[0]=sc.nextInt();
  System.out.println("enter the marks of 1th index position");
  marks[1]=sc.nextInt();
  System.out.println("the marks of 0 and 1 index are "+" "+marks[0]+" "+marks[1]);

  
   }
}
