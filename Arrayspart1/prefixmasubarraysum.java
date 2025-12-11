package Arrayspart1;

public class prefixmasubarraysum {
    //function to print the max subarray sum using prefix sum array
    public static void maxsubarraysum(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        //loop for calculating th prefix sum
        int prefix[]= new int[numbers.length];
        //we know that 0th index value o num and pre array are same
          prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
           prefix[i] = prefix[i-1] + numbers[i];

        }
        //now calcutlating the subarray sum
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                 if(maxsum<currsum){
                    maxsum=currsum;
                }
            
            }
           
        }
        System.out.println("the max sum value is "+maxsum);
    }
    public static void main(String[] args) {
        // int numbers[]={1,-2,6,-1,3};
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        //function call
        maxsubarraysum(numbers);
    }
}
