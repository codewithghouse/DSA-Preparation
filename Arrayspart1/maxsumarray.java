package Arrayspart1;

import patternspart1.star;

public class maxsumarray {
    //function to print the maximum subarray sum
    public static void printmaxsubarray(int numbers[],int l){
        int curr=0;
        int maxsum =Integer.MIN_VALUE;
        int count=0;
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
                System.out.print(curr+" ");
                if(maxsum<curr){
                    maxsum=curr;
                }
                if(curr==l){
                    count++;
                }

            }

        }
        System.out.println("the max subarray sum is :"+maxsum+" "+count);
    }
    public static void main(String[] args) {
        // int numbers[]={2,3,-1,4,6};
        int numbers[]={1,1,1};
        int l=2;
        //function call
        printmaxsubarray(numbers,l);
    }
    
}
