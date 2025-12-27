package sortingassignment;

public class pselectionsort {
    //function to implement selection sort
    public static void selection(int array[]){
        int n= array.length;
        //outer loop for current position
        for(int i=0;i<n-1;i++){
            int currentposition=i;
            //inner loop
            for(int j=i+1;j<n;j++){
                if(array[currentposition]>array[j]){
                    currentposition=j;
                }
            }
            //here we are doing swapping
            int temp=array[currentposition];
             array[currentposition]=array[i];
             array[i]=temp;

        }
    }
    public static void main(String[] args) {
         int array []={3,6,2,1,8,7,4,5,3,1};
         //function call
         selection(array);
         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
         }
    }
}
