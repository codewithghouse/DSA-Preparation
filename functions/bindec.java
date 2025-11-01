package functions;

import java.util.Scanner;



public class bindec {

  // function to calculate the binary to decimal
  public static void binary(int n){
    int mynum= n;
    int power=0;
    int dec= 0;
    // whle loop using
    while (n>0) {
      int lastdigit = n%10; // yahaahn se  last digit niklajata jo ke hamara remiander hee hai
      // yahaan pe ham math .pow ku int ke islie type cast karre kyunki ye double ku leta haiaur hame intme hona hai 

      dec= dec + (lastdigit * (int) Math.pow(2, power));
      power++;
      n= n/10; // to remove last digit
      
    }
    System.out.println("the dicaml of this " + mynum + "is "+dec);
  }
  public static void main(String[] args) {

    int n=110111;
    //calling the funtion
    // dryrun code yaad rkna ha i kiasa hora s
    binary(n);
    
  }
   

    }    