package assingments;

import java.util.Scanner;

// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("enter the value of c : ");
        int c= sc.nextInt();
        double Average =(a+b+c)/3;
        System.out.println("the average of these thress numbers are "+ Average);
    }
}
