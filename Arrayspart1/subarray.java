package Arrayspart1;

import loops.number;

public class subarray {
    //function to print sub arrays
public static void printsubarray(int numbers[]){
    //outer loop for current = starting index value
    for(int i=0;i<numbers.length;i++){
        int start= i; //storing the index value
        for(int j=i;j<numbers.length;j++){
            int end=j;
            //printing sub arrays
            for(int k=start;k<=end;k++){
                System.out.print(+numbers[k]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printsubarray(numbers);
    }
}
