package leetcode;
//most frequent even number 
public class mfen {
    //function to find most frequent even number in array
    public static void mostfen(int nums[]){
        int n= nums.length;
        int frequency=0;
        //loop
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                System.out.print(nums[i]+" ");
                frequency++;
            }
        }
        System.out.println(frequency);
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,2,2,4,4,4,3};
    //function call
    mostfen(nums);
    }
    
}
