package Arrayspart1;
//here maximum subarray sum is from kadane's algorithm

public class msasumbykadanes {
    //function to find the maximum subarray sum from kadane's algorithm
    public static void kadanesubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        //outer loop for each postion
        for(int i=0;i<numbers.length;i++){
            currsum= currsum+ numbers[i];
            if(currsum<0){
                currsum=0;
            }else if(maxsum<currsum){
                maxsum=currsum;

            }
           
        }
         System.out.println("the max sum is "+maxsum);
    }
    public static void kadanenegative(int number[]){
        int currsum=number[0];
        int maxsum=number[0];
        for(int i=0;i<number.length;i++){
            currsum = Math.max(currsum, number[i]);
        maxsum = Math.max(maxsum, currsum);
        }
 System.out.println("the max sub array sum is :"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        int number[]={-2,-3,-1,-4};
        //function call
        // kadanesubarray(numbers);
        kadanenegative(number);
    }
    
}
