package variable;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       float pie = 3.14f;
        System.out.println("enter the value of radius fo the circle : ");
        int radius = sc.nextInt();
       float area = pie*(radius*radius);
        System.out.println("the area of circle is : " + area);


    }
}
