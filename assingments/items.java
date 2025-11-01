package assingments;

import java.util.Scanner;

public class items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the 1st item : pencil : ");
        float pencil = sc.nextFloat();
        System.out.println("enter the value of 2 item pen : ");
        float pen = sc.nextFloat();
        System.out.println("enter the value of 3rd item eraser : ");
        float eraser = sc.nextFloat();
        double totalcost = pencil+pen+eraser;
        System.out.println("------------------");
        System.out.println("Pencil cost "+pencil);
        System.out.println("Pen cost "+pen);
        System.out.println("Eraser cost "+eraser);
        System.out.println("----------");
        System.out.println("The Total Cost of this items are "+totalcost);
    }
}
