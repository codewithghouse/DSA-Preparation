package sortings;

public class bubblesort {
    //function to perform  bubble sort 
    public static void bubble(int nums[]){
        int n= nums.length;
        //outer loop for turns
        for(int i=0;i<n-1;i++){
            //inner loop
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,1};
       //function call
       bubble(nums);
       //printing the array
       for(int i=0;i<nums.length;i++){
       System.out.println(nums[i]);
       }
    }
}
