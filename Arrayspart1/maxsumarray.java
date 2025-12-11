package Arrayspart1;

import patternspart1.star;

public class maxsumarray {
    //function to print the maximum subarray sum
    public static void printmaxsubarray(int numbers[]){
        int curr=0;
        int maxsum =Integer.MIN_VALUE;
        //outerloop for curr postion
        for(int i=0;i<numbers.length;i++){
            int start =i;
            //iner loop for end value
            for(int j=i;j<numbers.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr= curr+numbers[k];
                }
                System.out.println(curr);
                if(maxsum<curr){
                    maxsum=curr;
                }
            }

        }
        System.out.println("the max subarray sum is :"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,-1,4,6};
        //function call
        printmaxsubarray(numbers);
    }
    
}
