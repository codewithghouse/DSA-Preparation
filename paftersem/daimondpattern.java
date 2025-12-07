package paftersem;

public class daimondpattern {
// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *

//function to print  diamond pattern
public static void pattern(int n){
//first half

    //outer loop for rows
    for(int i=1;i<=n;i++){
        //first inner loop for stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //inner loop for space
          for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println("");

    }

    //second part
    
    //outer loop for rows
    for(int i=n-1;i>=1;i--){
        //first inner loop for stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //inner loop for space
          for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println("");

    }
}
public static void main(String[] args) {
    int n=4;
    pattern(n);
}

}
