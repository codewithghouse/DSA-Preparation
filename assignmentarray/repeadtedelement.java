package assignmentarray;

public class repeadtedelement {
  //brute force 
  public static boolean repeated(int nums[]){
    //outer loop
    for(int i=0;i<nums.length;i++){
        //inner loop
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
  }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        //function call
        System.out.println(repeated(nums));

    }
}
